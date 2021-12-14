package main.com.slice.regexhexnumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHexNumber {

    public boolean checkHexNumber(String str){
        Pattern pattern = Pattern.compile("[^0-9A-Fa-f]");
        Matcher matcher = pattern.matcher(str);


        if (matcher.find()){
            return false;
        }
        else {
            return true;
        }
    }

}
