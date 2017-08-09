package com.taxSoapWebService.test.demo;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mshaik on 6/28/17.
 */
public class Test {


    public static final String EXAMPLE_TEST = "There are existing Clearance P5 price ($12.49567) with lower or equal price ($12.490000000) than the mark down.";

    public static void main(String[] args) {


        /*Pattern pattern = Pattern.compile("\\d*.\\d*+\\)");
        Matcher matcher = pattern.matcher(EXAMPLE_TEST);
        // check all occurance
        while (matcher.find()) {
            String error = matcher.group();
            System.out.println(error.substring(0,error.length()-1));
            break;
        }*/

        String d1 = "64.99";
        String d2 = "64.99000000";
        String d3 = "70.00";
        List<Double> test = new ArrayList<>();

        test.add(Double.valueOf(d1));
        test.add(Double.valueOf(d2));
        test.add(Double.valueOf(d3));


        Set<Double> list = new HashSet<>();
        list.add(Double.valueOf(d1));
        list.add(Double.valueOf(d2));
        list.add(Double.valueOf(d3));
        System.out.print("SIze is"+list.size()+test.size());
    }

}
