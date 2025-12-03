package h1;

public class H1_main {
    public static void main(String[] args) {
        Zahl test = new Zahl();

        test.num = 150;
        test.setSmall();
        test.setPositive();
        test.setEven();

        System.out.println("Small = " + test.small + ", Positive = " + test.positive + ", Even = " + test.even);
    }

}
