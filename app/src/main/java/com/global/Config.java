package com.global;

import android.util.Log;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Config {

    public final static String serverURL = "http://13.232.121.192:9005/api/ApexRiderWebApi/";

    public final static String OS_Type = "1";



    public String passwordSHA(String passwordString) {
        String password = "";

        Log.d("passwordSHA_Function==>", password);

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");
            md.update(passwordString.getBytes());

            byte byteData[] = md.digest();

            //convert the byte to hex format method 1
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }

            password = sb.toString();
            Log.d("PasswordSHA_converted=>", password);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return password;
    }

    public String setDateTime( String dateTime) {

        String setDateTime = "";
        Date read_Date;
        String day = "";

        DateFormat ReadDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        DateFormat writeFormat = new SimpleDateFormat("MMM dd, yyyy hh:mm a", Locale.US);


        // Date read_Date = null;
        try {
            read_Date = ReadDateFormat.parse(dateTime);
             day = String.valueOf(read_Date).substring(0, 3);
            setDateTime = writeFormat.format(read_Date);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return day + " " + setDateTime;

    }
}
