import java.math.BigDecimal;
import java.math.MathContext;

public class Run {
    public static void main(String[] args) {

        BigDecimal number1 = new BigDecimal("124567890.0987654321");
        BigDecimal number2 = new BigDecimal("987654321.123456789");

        //addition
        BigDecimal sumOfNumber1AndNumber2 = number1.add(number2);

        //substraction
        BigDecimal differenceOfNumber1AndNumber2 = number1.subtract(number2);

        //multiplication
        BigDecimal ratioOfNumber1AndNumber2 = number1.multiply(number2);

        //division
        BigDecimal quotientOfNumber1AndNumber2 = number1.divide(new BigDecimal("2"));

        //sout 1
        BigDecimal testNewBigDecimal = new BigDecimal("3.55").divide(new BigDecimal("3.55"), MathContext.DECIMAL32);

        //.ArithmeticException: Non-terminating decimal expansion;
        BigDecimal testSimplyDecimal = new BigDecimal(3.55).divide(BigDecimal.valueOf(3.55));

        //sout 1.000000
        BigDecimal testDecimal32 = new BigDecimal(3.55).divide(BigDecimal.valueOf(3.55), MathContext.DECIMAL32);

        //sout 0.9999999999999999
        BigDecimal testDecimal64 = new BigDecimal(3.55).divide(BigDecimal.valueOf(3.55), MathContext.DECIMAL64);

        //sout - 0.9999999999999999499617791718239306
        BigDecimal testDecimal128 = new BigDecimal(3.55).divide(BigDecimal.valueOf(3.55), MathContext.DECIMAL128);

        //W klasie MathContext ustawiamy precyzję i tryb zaokrąglenia.

        //compare
        int compareOfNumber1AndNumber2 = number1.compareTo(number2);
        //if Number1 < Number2 return -1;
        //if Number1 > Number2 return 1;
        //if Number1 == Number2 return 0;
    }
}
