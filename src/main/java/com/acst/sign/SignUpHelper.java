package com.acst.sign;

import com.acst.sign.entry.SignUpEntry;
import com.acst.sign.entry.SignUpResponse;

public class SignUpHelper {

    SignBaseClient signBaseClient = new SignBaseClient();

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
