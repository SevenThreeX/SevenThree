package com.seventhree.st.controller;

import com.github.pagehelper.PageHelper;
import com.seventhree.st.annotation.CustomAnnotations;
import com.seventhree.st.model.User;
import com.seventhree.st.model.commond.UserToken;
import com.seventhree.st.service.UserService;
import com.seventhree.st.service.commond.RedisService;
import com.seventhree.st.utils.PageInfo;
import com.seventhree.st.utils.ResultModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@Api(value = "用户接口")
@RestController
public class UserController {
@Autowired
private UserService userService;
@Autowired
private RedisService redisService;
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @ApiOperation(value = "获取用户列表", notes="获取用户列表")
    @ApiImplicitParams({@ApiImplicitParam(name = "pageNum", value = "分页页码,从1开始", defaultValue = "1", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页数量", defaultValue = "10", paramType = "query")
    })
    @RequestMapping(value="/getList",method= RequestMethod.GET )
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){

        PageHelper.startPage(pageNum, pageSize);
        User user = new User();
        PageInfo<User> userPageInfo = userService.selectAllUsers(user,pageNum,pageSize);

        return new ResponseEntity<>(ResultModel.ok(userPageInfo), HttpStatus.OK);
    }
    @CustomAnnotations.PassToken
    @ApiOperation(value = "登录", notes="登录")
    @ApiImplicitParams({@ApiImplicitParam(name = "phone", value = "账号", paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码", paramType = "query")
    })
    @RequestMapping(value="/login",method= RequestMethod.POST )
    public Object login(
            @RequestParam(name = "phone") String phone,
            @RequestParam(name = "password") String password){

        User user = userService.selectUserByPhone(phone, password);
        if (user!=null){
            UserToken token = redisService.createToken(user);
            return new ResponseEntity<>(ResultModel.ok(token), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(ResultModel.error(user), HttpStatus.NOT_FOUND);
        }

    }

    @CustomAnnotations.PassToken
    @ApiOperation(value = "获取用户token", notes="获取用户token")
    @ApiImplicitParams(@ApiImplicitParam(name = "userId", value = "用户ID", paramType = "query")
    )
    @RequestMapping(value="/getToken",method= RequestMethod.GET )
    public Object getToken(
            @RequestParam(name = "userId", required = false, defaultValue = "1")
                    int userId){
        UserToken token = redisService.getToken(userId);
        return new ResponseEntity<>(ResultModel.ok(token), HttpStatus.OK);
    }


}
