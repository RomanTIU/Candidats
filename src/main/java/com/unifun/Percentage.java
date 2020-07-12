package com.unifun;

import lombok.extern.java.Log;

import java.text.DecimalFormat;

@Log
public class Percentage {

    public static double getPercentage(int a, int b){
        double sum = a+b;
        if (a == b ) return 0;
        if (a > b){
            return 100 * (a-b) / sum;
        } else {
            return 100 * (b-a) / sum;
        }

    }
    public static void showResult(int a, int b){
        if (getPercentage(a,b)!=0) {
            if ( a > b ) log.info(new DecimalFormat("A #.####").format(getPercentage(a,b))+"%");
            else log.info(new DecimalFormat("B #.####").format(getPercentage(a,b))+"%");
        }
        else log.info("Draw");
    }
}
