package com.seventhree.st.service.commond;

import com.seventhree.st.model.User;
import com.seventhree.st.model.commond.UserToken;

public interface RedisService {


    UserToken createToken(User User);

    UserToken getToken(Integer userId);
}
