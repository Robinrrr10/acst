package com.acst.sign;

import com.acst.commons.entry.Context;
import com.acst.sign.entry.SignUpEntry;
import com.acst.sign.entry.SignUpResponse;

import java.io.IOException;

public class SignUpHelper {

    SignBaseClient signBaseClient;


    public SignUpHelper() throws IOException {
        signBaseClient = new SignBaseClient();
    }

    public SignUpResponse doSignUp(String name, String email, String password, Long aadhaar){
        SignUpEntry signUpEntry = new SignUpEntry();
        signUpEntry.setEmail(email);
        signUpEntry.setName(name);
        signUpEntry.setPassword(password);
        signUpEntry.setAadhaar(aadhaar);
        SignUpResponse signUpResponse = signBaseClient.signUp(signUpEntry);
        return signUpResponse;
    }
}
