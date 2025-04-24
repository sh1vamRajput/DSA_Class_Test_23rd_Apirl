public class power {
    public static double pow(double b, int e) {
        if (e == 0) {
            return 1;
        } else if (e > 0) {
            return b * pow(b, e - 1);
        } else {
            return 1 / pow(b, -e);
        }
    }

    public static void main(String[] args) {
        double base = 2;
        int exponent = -3;
        System.out.println(base + " raised to the power " + exponent + " is: " + pow(base, exponent));
    }
}
