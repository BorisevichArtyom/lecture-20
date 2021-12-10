package by.itacademy.javaenterprise.borisevich.util;

public class Convertation {
    public static String convertToBYN(int penny) {
        if (penny < 0) {
            throw new IllegalArgumentException("Penny should be >0:" + penny);
        }
        return penny / 100 + "." + penny / 10 % 10 + penny % 10;
    }
    public static String convertToBYN(long penny) {
        if (penny < 0) {
            throw new IllegalArgumentException("Penny should be >0:" + penny);
        }
        return penny / 100 + "." + penny / 10 % 10 + penny % 10;
    }
}
