package com.acst.sign;

import com.acst.commons.GetProperties;
import com.acst.sign.client.SignUp;
import com.acst.sign.entry.SignUpEntry;
import com.acst.sign.entry.SignUpResponse;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import java.io.IOException;

public class SignBaseClient {

    private static String baseUrl;
    public SignBaseClient() throws IOException {
        baseUrl = "http://"+ GetProperties.getProperties("com.acst.url.base") +"/acs/v1";
       // baseUrl = "http://localhost:8080/acs/v1";
    }


    public SignUpResponse signUp(SignUpEntry signUpEntry){
        SignUp signUp = JAXRSClientFactory.create(baseUrl, SignUp.class);
        return signUp.doSignUp(signUpEntry);
    }
}
