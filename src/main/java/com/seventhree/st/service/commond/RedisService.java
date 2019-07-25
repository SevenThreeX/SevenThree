package com.seventhree.st.service.commond;

import com.seventhree.st.model.commond.UserToken;

public interface RedisService {


    UserToken createToken(Integer userId);

    UserToken getToken(Integer userId);
}
