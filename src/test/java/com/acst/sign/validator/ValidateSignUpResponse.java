package com.acst.sign.validator;

import com.acst.sign.entry.SignUpResponse;
import org.testng.Assert;

public class ValidateSignUpResponse {

    public void assertSignUpSuccessfull(SignUpResponse signUpResponse){
        Assert.assertEquals(signUpResponse.getStatus().getStatusCode(), 10001, "SignUp Failed. StatusCode incorrect. StatusMessage: "+signUpResponse.getStatus().getStatusMessage());
        Assert.assertEquals(signUpResponse.getStatus().getStatusMessage(), "SignUp successfull. User is added", "SignUp Failed. StatusMessage Incorrect");
        Assert.assertNotNull(signUpResponse.getSignUpEntry().getAccountNo());
    }
    public void assertAlreadySignUpedUser(SignUpResponse signUpResponse){
        Assert.assertEquals(signUpResponse.getStatus().getStatusCode(), 11001, "StatusCode incorrect. StatusMessage: "+signUpResponse.getStatus().getStatusMessage());
        Assert.assertEquals(signUpResponse.getStatus().getStatusMessage(), "SignUp Fails. Aleady exists with  same emailId", "StatusMessage Incorrect");
        Assert.assertEquals(signUpResponse.getStatus().getState(), "ERROR", "State is not as expected");
    }

    public void assertSignUpWithoutMandatoryParameter(SignUpResponse signUpResponse){
        Assert.assertEquals(signUpResponse.getStatus().getStatusCode(), 11002, "StatusCode incorrect. StatusMessage: "+signUpResponse.getStatus().getStatusMessage());
        Assert.assertEquals(signUpResponse.getStatus().getStatusMessage(), "SignUp Fails. Mantory parameter is missings", "StatusMessage Incorrect");
        Assert.assertEquals(signUpResponse.getStatus().getState(), "ERROR", "State is not as expected");
    }
}
