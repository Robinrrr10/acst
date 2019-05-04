package com.acst.sign;

import com.acst.sign.client.SignUp;
import com.acst.sign.entry.SignUpEntry;
import com.acst.sign.entry.SignUpResponse;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;

public class SignBaseClient {

    private String baseUrl = "http://localhost:8080/acs/v1";

    public SignUpResponse signUp(SignUpEntry signUpEntry){
        SignUp signUp = JAXRSClientFactory.create(baseUrl, SignUp.class);
        return signUp.doSignUp(signUpEntry);
    }
}
