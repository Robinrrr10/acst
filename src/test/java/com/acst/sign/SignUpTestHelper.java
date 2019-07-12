package com.acst.sign;

import com.acst.sign.constant.SignUpConstant;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SignUpTestHelper {

    public String getRandomEmail(){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_SS_ss");
        String ss = dateTimeFormatter.format(localDateTime);
        String email = SignUpConstant.PRE_EMAIL + ss + "@gmail.com";
        return email;
    }


}
