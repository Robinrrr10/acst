package com.acst.sign;

import com.acst.sign.entry.SignUpEntry;
import com.acst.sign.entry.SignUpResponse;
import com.acst.sign.validator.ValidateSignUpResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest {

    SignUpHelper signUpHelper = new SignUpHelper();
    ValidateSignUpResponse validateSignUpResponse = new ValidateSignUpResponse();
    SignUpTestHelper signUpTestHelper = new SignUpTestHelper();
    @Test
    public void newUserSignUpSuccessfull(){
        /*SignUpResponse signUpResponse = signUpHelper.doSignUp();
        System.out.print("Status message is:"+signUpResponse.getStatus().getStatusMessage());
        validateSignUpResponse.assertSignUpSuccessfull(signUpResponse);*/
    }

    @Test
    public void signUpAlreadySignUpedUser(){
        String mm = signUpTestHelper.getRandomEmail();
        System.out.println("emial is:"+mm);

    }
}
