package com.seventhree.st.service;



import com.seventhree.st.model.User;
import com.seventhree.st.utils.PageInfo;
import com.seventhree.st.utils.ResultModel;

import java.util.List;
import java.util.Map;

public interface UserService {

    User selectUserById(int userId);

    //通过条件机进行查询用户列表
    PageInfo<User> selectAllUsers(User user,int pageNum, int pageSize);

    User selectUserByPhone(String phone ,String password);
    


}
