import java.text.DecimalFormat;

public class DigitFormat {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(2);
        double decimalNumber=1.93211;
        System.out.format(df.format(decimalNumber));

    }
}