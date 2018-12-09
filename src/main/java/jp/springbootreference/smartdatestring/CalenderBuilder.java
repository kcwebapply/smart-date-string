package jp.springbootreference.smartdatestring;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalenderBuilder {

    private Calendar calendar;

    CalenderBuilder(){
        this.calendar = Calendar.getInstance();
    }

    CalenderBuilder(Calendar calendar){
        this.calendar = calendar;
    }

    CalenderBuilder(Date date){
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        this.calendar = calendar;
    }

    CalenderBuilder setYear(int year){
        calendar.set(Calendar.YEAR,year);
        return this;
    }

    CalenderBuilder setMonth(int month){
        calendar.set(Calendar.MONTH,month);
        return this;
    }

    CalenderBuilder setDate(int date){
        calendar.set(Calendar.DATE,date);
        return this;
    }

    CalenderBuilder setTimezone(TimeZone timezone){
        calendar.setTimeZone(timezone);
        return this;
    }

    CalenderBuilder setPreviousDay(int day){
        calendar.add(Calendar.DATE,-day);
        return this;
    }

    CalenderBuilder setLaterDay(int day){
        calendar.add(Calendar.DATE,day);
        return this;
    }

    Calendar build(){
        return this.calendar;
    }

}
