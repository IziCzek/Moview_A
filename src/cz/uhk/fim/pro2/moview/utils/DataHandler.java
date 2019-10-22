package cz.uhk.fim.pro2.moview.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DataHandler {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);

    public static Date getDateFromString(String date){

        Date parseDate = null;
        try {
            parseDate = sdf.parse(date);
        }catch (ParseException e){

            e.printStackTrace();

        }
        return parseDate;

    }

    public static String getStringFromDate(Date date){

        return sdf.format(date);

    }


}
