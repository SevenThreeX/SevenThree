package com.seventhree.st.service;
import com.seventhree.st.model.UserDomain;
import com.seventhree.st.utils.PageInfo;
//import com.github.pagehelper.PageInfo;

/**
 * Created by Administrator on 2018/8/10.
 */
public interface UserService {

    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);

    UserDomain selectByPhone(String phone,String password);


}
