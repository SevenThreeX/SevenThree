package com.seventhree.st.mapper;



import com.seventhree.st.model.UserDomain;

import java.util.List;

public interface UserDao {


    int insert(UserDomain record);



    List<UserDomain> selectUsers();

    UserDomain selectByPhone(String phone ,String password);
}
