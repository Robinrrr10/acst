package com.acst.sign.client;

import com.acst.sign.entry.SignUpEntry;
import com.acst.sign.entry.SignUpResponse;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/signUp")
public interface SignUp {

    @POST
    @Path("/do")
    public SignUpResponse doSignUp(SignUpEntry signUpEntry);
}
