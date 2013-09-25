package com.example.gpslogger;

import android.app.Activity;
import android.text.format.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CustomDateUtils {

    public static String timeAgoInWords(Activity activity, long timestamp){
        return (String) DateUtils.getRelativeDateTimeString(activity,
                timestamp,
                DateUtils.MINUTE_IN_MILLIS,
                DateUtils.WEEK_IN_MILLIS,
                0);
    }

    public static String formatDateTimestamp(long timestamp){
        Calendar cal = Calendar.getInstance();
        TimeZone tz = cal.getTimeZone();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf.setTimeZone(tz);

        String localTime = sdf.format(new Date(timestamp));
        return localTime;
    }
}
