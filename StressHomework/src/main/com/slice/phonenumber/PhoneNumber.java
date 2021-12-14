package main.com.slice.phonenumber;

import java.util.regex.Pattern;

public class PhoneNumber {

    public static boolean isPhoneNumber(String str){
        String number = "\\+[1-9]\\d{0,2} \\d{2,3} \\d{3}\\-\\d{2}\\-\\d{2}";
        if (Pattern.compile(number).matcher(str).matches()) {
            return true;
        }
        return false;
    }



}
