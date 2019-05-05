package com.acst.sign;

import com.acst.sign.constant.SignUpConstant;
import com.acst.sign.entry.SignUpEntry;
import com.acst.sign.entry.SignUpResponse;
import com.acst.sign.validator.ValidateSignUpResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignUpTest {

    SignUpHelper signUpHelper;

    ValidateSignUpResponse validateSignUpResponse = new ValidateSignUpResponse();
    SignUpTestHelper signUpTestHelper = new SignUpTestHelper();

    public SignUpTest() throws IOException {
        signUpHelper = new SignUpHelper();
    }

    @Test(description = "Sign up for new user and verify whether signUp is successfull or not", groups = {"sanity", "regression"})
    public void newUserSignUpSuccessfull(){
        SignUpResponse signUpResponse = signUpHelper.doSignUp(SignUpConstant.NAME, signUpTestHelper.getRandomEmail(), SignUpConstant.PASSWORD, SignUpConstant.AADHAAR);
        System.out.print("Status message is:"+signUpResponse.getStatus().getStatusMessage());
        validateSignUpResponse.assertSignUpSuccessfull(signUpResponse);
    }

    @Test(description = "Sign up for already signedup user and verify", groups = {"sanity", "regression"})
    public void signUpAlreadySignUpedUser(){
        final String emailId = signUpTestHelper.getRandomEmail();
        SignUpResponse signUpResponse = signUpHelper.doSignUp(SignUpConstant.NAME, emailId, SignUpConstant.PASSWORD, SignUpConstant.AADHAAR);
        System.out.println("Status message is:"+signUpResponse.getStatus().getStatusMessage());
        validateSignUpResponse.assertSignUpSuccessfull(signUpResponse);
        SignUpResponse signUpResponse2 = signUpHelper.doSignUp(SignUpConstant.NAME, emailId, SignUpConstant.PASSWORD, SignUpConstant.AADHAAR);
        System.out.println("Status message is:"+signUpResponse2.getStatus().getStatusMessage());
        validateSignUpResponse.assertAlreadySignUpedUser(signUpResponse2);
    }

    @Test(description = "Sign up without mandatory parameter and verify", groups = {"regression"})
    public void signUpWithoutMandatoryParameter(){
        SignUpResponse signUpResponse = signUpHelper.doSignUp(SignUpConstant.NAME, null, SignUpConstant.PASSWORD, SignUpConstant.AADHAAR);
        System.out.print("Status message is:"+signUpResponse.getStatus().getStatusMessage());
        validateSignUpResponse.assertSignUpWithoutMandatoryParameter(signUpResponse);
    }
}
