package com.seventhree.st.controller.common;


import com.seventhree.st.model.commond.FileInfoVo;
import com.seventhree.st.utils.ResultModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Api(description = "其他")
@Controller
public class OtherController {

    private String imgPath = "/usr/local/tomcat/webapps/img/";
//    private String imgUrl = "http://192.168.31.12/img/";
    private String imgUrl = "http://http://27.102.113.123/img/";

    @ApiOperation(value = "上传图片")
    @RequestMapping(value = "/upLoadImg",
            method = RequestMethod.POST,
            produces = "application/json;charset=UTF-8")
    @ResponseBody

    public Object upLoadImg(
            @ApiParam(value = "传输图片", required = true)
            @RequestParam(value = "file") MultipartFile file
    ) {
        FileInfoVo fileInfoVo = saveImg(file);
        if (fileInfoVo == null) {
            return new ResponseEntity<>(ResultModel.error(null), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(ResultModel.ok(fileInfoVo.getFileUrl()), HttpStatus.OK);
        }
    }

    @ApiOperation(value = "上传多张图片")
    @RequestMapping(value = "/upLoadImgMap",
            method = RequestMethod.POST,
            produces = "application/json;charset=UTF-8")
    @ResponseBody

    public Object upLoadImgMap(
            @ApiParam(value = "传输图片", required = true)
            @RequestParam(value = "file") MultipartFile[] files
    ) {
        Map<String, String> map = new HashMap<>();
        for (MultipartFile entry : files) {
            FileInfoVo fileInfoVo = saveImg(entry);
            if (fileInfoVo == null) {
                return new ResponseEntity<>(ResultModel.error(null), HttpStatus.OK);
            } else {
                map.put(entry.getOriginalFilename(), fileInfoVo.getFileUrl());
            }
        }
        return new ResponseEntity<>(ResultModel.ok(map), HttpStatus.OK);
    }

    private FileInfoVo saveImg(MultipartFile file) {
        System.out.println(imgPath + imgUrl);
        try {
            if (ImageIO.read(file.getInputStream()) == null) {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //查找数据库是否由此用户
        String fileName = imgPath + file.getOriginalFilename();
        //保存图片
        try {
            File dest = new File(fileName);
            if (!dest.getParentFile().exists()) { //判断文件父目录是否存在
                dest.getParentFile().mkdirs();
            }
            file.transferTo(dest); //保存文件
        } catch (IllegalStateException | IOException e) {
            return null;
        }
        FileInfoVo fileInfoVo = new FileInfoVo();
        fileInfoVo.setCreateTime(System.currentTimeMillis());
        fileInfoVo.setFileType("*image");
        fileInfoVo.setFileUrl(imgUrl + file.getOriginalFilename());
        return fileInfoVo;
    }
}
