public class convertCF {
//    chuyển từ độ C sang F
    public static double Celsius(double a) {
        double Celsius =  (1.8 * a + 32);
        return Celsius;
    }

// chuyển từ độ F sang độ C
    public static double Fahren(double a) {
        double Fahren =  (a - 32)/ 1.8;
        return Fahren;
    }
}
