package com.seventhree.st.controller;
import com.github.pagehelper.PageHelper;
import com.seventhree.st.model.UserDomain;
import com.seventhree.st.service.UserService;
import com.seventhree.st.utils.ResultModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by Administrator on 2018/8/10.
 */
@Api(value = "用户接口")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;



    @ApiOperation(value = "新增用户", notes="新增用户")
    @RequestMapping(value="/createUser",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public int addUser(UserDomain user){
        return userService.addUser(user);
    }

    @ApiOperation(value = "获取用户列表", notes="获取用户列表")
    @ApiImplicitParams({@ApiImplicitParam(name = "pageNum", value = "分页页码,从1开始", defaultValue = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页数量", defaultValue = "10", paramType = "query")
    })
    @RequestMapping(value="/getList",method=RequestMethod.GET )
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return new ResponseEntity<>(ResultModel.ok(userService.findAllUser(pageNum,pageSize)), HttpStatus.OK);
    }


    @ApiOperation(value = "登录", notes="登录")
    @RequestMapping(value="/login",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams({@ApiImplicitParam(name = "phone", value = "电话", paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", paramType = "query")
    })
    public Object login(@RequestParam(name = "phone")
                                 String phone,
                     @RequestParam(name = "password")
                             String password){

        UserDomain userDomain = userService.selectByPhone(phone, password);

        if (userDomain!=null && userDomain.getPassword().equals(password)){
            String token = UUID.randomUUID().toString().replace("-", "");

//        存储到redis并设置过期时间
//            redis.boundValueOps(userDomain.getUserId()).set(token, 72);
        }

        return  null;

    }




}
