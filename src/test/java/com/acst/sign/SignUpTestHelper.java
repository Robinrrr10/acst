package com.acst.sign;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SignUpTestHelper {

    public String getRandomEmail(){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:SS:ss");
        String ss = dateTimeFormatter.format(localDateTime);
        return ss;
    }
}
