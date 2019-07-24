package com.seventhree.st.controller;

import com.github.pagehelper.PageHelper;
import com.seventhree.st.model.User;
import com.seventhree.st.service.UserService;
import com.seventhree.st.utils.PageInfo;
import com.seventhree.st.utils.ResultModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "用户接口")
@RestController
//@RequestMapping("/user")
public class UserController {
@Autowired
private UserService userService;

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
}
