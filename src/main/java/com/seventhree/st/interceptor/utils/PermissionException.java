package com.seventhree.st.interceptor.utils;

public class PermissionException extends RuntimeException{

    public PermissionException(String errorMessage) {
        super(errorMessage);
    }
}
