package utils;

public class Formatter {

    public static double convertStringDouble(String value) {
        try{
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
           e.printStackTrace();
        }
        return 1;
    }

    public static long convertStringLong(String value) {
        try{
            return Long.parseLong(value);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return 1;
    }

    public static double round(double value) {
        return (double)Math.round(value * 100d) / 100d;
    }



}
