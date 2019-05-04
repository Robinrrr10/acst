package com.acst.sign.validator;

import com.acst.sign.entry.SignUpResponse;
import org.testng.Assert;

public class ValidateSignUpResponse {

    public void assertSignUpSuccessfull(SignUpResponse signUpResponse){
        Assert.assertEquals(signUpResponse.getStatus().getStatusCode(), 10001, "SignUp Failed. StatusCode incorrect. StatusMessage: "+signUpResponse.getStatus().getStatusMessage());
        Assert.assertEquals(signUpResponse.getStatus().getStatusMessage(), "SignUp successfull. User is added", "SignUp Failed. StatusMessage Incorrect");
        Assert.assertNotNull(signUpResponse.getSignUpEntry().getAccountNo());
    }
}
