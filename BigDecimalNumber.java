import java.math.*;
public class BigDecimalNumber{

    public static void main(String[] args) {
        double d = 1.2;
        d = d-0.8;
        System.out.println(d);
        System.out.println(Math.round(d*1.0)/1.0);

        BigDecimal bd = new BigDecimal (100000.20000);
        BigDecimal bd2 = new BigDecimal(100000.20000);
        BigDecimal bd3 = bd.add(bd2);
        System.out.println(bd3);
        System.out.println(bd.compareTo(bd2));
        System.out.println(bd.compareTo(bd3));
        System.out.println(bd2.compareTo(bd3));

        BigDecimal b = new BigDecimal("12.34");
        double num = b.doubleValue();

        BigDecimal b2 = new BigDecimal("11.23");
        double num2 = b2.doubleValue();

        double result = num+num2;
        System.out.println(num + num2);
        System.out.println("sum of 2 no's:" + num+num2);

    }
}