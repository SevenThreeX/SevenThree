package com.seventhree.st.service.impl;

import com.github.pagehelper.PageHelper;

import com.seventhree.st.mapper.UserMapper;
import com.seventhree.st.model.User;
import com.seventhree.st.model.UserExample;
import com.seventhree.st.service.UserService;
import com.seventhree.st.utils.PageInfo;
import com.seventhree.st.utils.ResultModel;
import com.seventhree.st.utils.ResultStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
  
	@Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserById(int userId) {
    	return this.userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public PageInfo<User> selectAllUsers(User user,int pageNum, int pageSize){
    	UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        
        if (null != user.getUserName()) {
            criteria.andUserNameEqualTo(user.getUserName());
        }
        if (null != user.getPhone()) {
            criteria.andPhoneEqualTo(user.getPhone());
        }
        if (null != user.getUserId()) {
        	criteria.andUserIdEqualTo(user.getUserId());
        }
        
        if (null != user.getReferer()) {
        	criteria.andRefererEqualTo(user.getReferer());
        }

        PageHelper.startPage(pageNum, pageSize);
        List<User> users = this.userMapper.selectByExample(userExample);



        PageInfo result = new PageInfo(users);
        return result;
    }

    @Override
    public User selectUserByPhone(String phone, String password) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andPhoneEqualTo(phone);
        criteria.andPassWordEqualTo(password);
        List<User> users = this.userMapper.selectByExample(userExample);
        if (users.size()>0){
            return users.get(0);
        }
        return null;
    }


}
