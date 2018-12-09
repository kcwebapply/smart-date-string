package jp.springbootreference.smartdatestring;


import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class SmartDateString extends SmartDate{
    // date string generate
    public static String generate(String format){
        final Calendar calendar = new CalenderBuilder()
                .build();
        return generateSimpleFormat(format).format(calendar.getTime());
    }

    public static String generate(String format, Calendar calendar){
        return generateSimpleFormat(format).format(calendar.getTime());
    }

    public static String generate(String format, Date date){
        return generateSimpleFormat(format).format(date);
    }

    public static String generate(String format, TimeZone timeZone){
        final Calendar calendar = new CalenderBuilder()
                .setTimezone(timeZone)
                .build();
        return generateSimpleFormat(format).format(calendar.getTime());
    }

    public static String generate(String format, Date date, TimeZone timeZone){
        final Calendar calendar = new CalenderBuilder(date)
                .setTimezone(timeZone)
                .build();
        return generateSimpleFormat(format).format(calendar.getTime());
    }

    public static String generate(String format, int year){
        final Calendar calendar = new CalenderBuilder()
                .setYear(year)
                .build();
        return generateSimpleFormat(format).format(calendar.getTime());
    }

    public static String generate(String format, int year, int month){
        final Calendar calendar = new CalenderBuilder()
                .setYear(year)
                .setMonth(month)
                .build();
        return generateSimpleFormat(format).format(calendar.getTime());
    }

    public static String generate(String format, int year, int month, int date){
        final Calendar calendar = new CalenderBuilder()
                .setYear(year)
                .setMonth(month)
                .setDate(date)
                .build();
        return generateSimpleFormat(format).format(calendar.getTime());
    }

    // 日付
    public static String generatePreviousDay(String format, int day){
        final Calendar calendar = new CalenderBuilder()
                .setPreviousDay(day)
                .build();
        return generateSimpleFormat(format).format(calendar.getTime());
    }

    public static String generateLaterDay(String format, int day){
        final Calendar calendar = new CalenderBuilder()
                .setLaterDay(day)
                .build();
        return generateSimpleFormat(format).format(calendar.getTime());
    }

    public static String generatePreviousDay(String format, int day, Calendar calendarObject){
        final Calendar calendar = new CalenderBuilder(calendarObject)
                .setPreviousDay(day)
                .build();
        return generateSimpleFormat(format).format(calendar.getTime());
    }

    public static String generatePreviousDay(String format, int day, Date dateObject){
        final Calendar calendar = new CalenderBuilder(dateObject)
                .setPreviousDay(day)
                .build();
        return generateSimpleFormat(format).format(calendar.getTime());
    }

    public static String generateLaterDay(String format, int day, Calendar calendarObject){
        final Calendar calendar = new CalenderBuilder(calendarObject)
                 .setLaterDay(day)
                .build();
        return generateSimpleFormat(format).format(calendar.getTime());
    }

    public static String generateLaterDay(String format, int day, Date dateObject){
        final Calendar calendar = new CalenderBuilder(dateObject)
                .setLaterDay(day)
                .build();
        return generateSimpleFormat(format).format(calendar.getTime());
    }

    public static String generatePreviousDay(String format, int day, TimeZone timeZone){
        final Calendar calendar = new CalenderBuilder()
                .setTimezone(timeZone)
                .setPreviousDay(day)
                .build();
        return generateSimpleFormat(format).format(calendar.getTime());
    }

    public static String generateLaterDay(String format, int day, TimeZone timeZone){
        final Calendar calendar = new CalenderBuilder()
                .setTimezone(timeZone)
                .setLaterDay(day)
                .build();
        return generateSimpleFormat(format).format(calendar.getTime());
    }

}
