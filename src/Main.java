public class Main {
    public static void main(String[] args) {

        int a = 24;
        while (a != 0) {
            int i = a % 10;
            if (i == 0 || a % i != 0) {
                System.out.println("The number " + a + " is not divisible by " + i);
                break;
            }
            int result = a / i;
            System.out.println(a + "/" + i + " = " + result);
            a /= 10;
        }
    }
}