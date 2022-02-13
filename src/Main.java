public class Main {
    public static void main(String[] args){
//        tổng
        int resultSum = calculator.sum(8, 4);
        System.out.println("tổng của hai số a, b là " + resultSum);

//       Hiệu
        int resultDiv = calculator.div(8, 4);
        System.out.println("Hiệu của hai số a, b là " + resultDiv);

//       Tích
        int resultProduct = calculator.product(8, 4);
        System.out.println("Tích của hai số a, b là " + resultProduct);

//        Thương

        int resultQout = calculator.quotient(8, 4);
        System.out.println("Thương của hai số a, b là " + resultQout);

//        Lũy thừa

        int resultPow1 = calculator.pow1(3,3);
        System.out.println("Lũy thừa là " + resultPow1);





//        Chuyển đổi độ C sang độ F
        double resultCelsius = convertCF.Celsius(1.8);
        System.out.println("Độ F là " + resultCelsius);


//        Chuyển từ F sang C

        double resultFahren = convertCF.Fahren(35.24);
        System.out.println("Độ C là " + resultFahren);

    }




}
