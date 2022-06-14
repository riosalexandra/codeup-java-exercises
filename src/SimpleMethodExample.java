

public class SimpleMethodExample {

    public static int doMath(int num1, int num2, int num3) {
        return num1 + (num2 * num3);
    }

    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        int total = doMath(num1, num2, num3);

        System.out.println(total);

    }

}