package com.devstromo.kyu7.DTC;

import java.text.DecimalFormat;

public class DTC {
    public static double toIndustrial(String time) {
        var parts = time.split(":");
        var hours = Integer.parseInt(parts[0]);
        var minutes = Integer.parseInt(parts[1]);
        var decimalTime = hours + toIndustrial(minutes);
        return Math.round(decimalTime * 100.0) / 100.0;
    }

    public static double toIndustrial(int time) {
        return Math.round(time * 0.0166666666666667 * 100) / 100.0;
    }

    public static String toNormal(double time) {
        var hours = (int) time;
        var minutes = (int) Math.round((time - hours) * 60);
        var df = new DecimalFormat("00");
        return hours + ":" + df.format(minutes);
    }
}
