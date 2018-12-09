package jp.springbootreference.smartdatestring;

import java.text.SimpleDateFormat;

public abstract class SmartDate {

    protected static SimpleDateFormat generateSimpleFormat(String format){
        return new SimpleDateFormat(format);
    }

}
