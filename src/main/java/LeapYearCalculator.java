public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }
    public static boolean isLeapYear(int year) {
        /* Primera condición: Validación de años permitidos
           Segunda condición: Comprobación de año bisiesto no divisible por 4 y no por 100
           Tercera condición: Comprobación de año bisiesto divisible por 400
         */
        return (year>0 && year<10000) && ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0));
    }
}
