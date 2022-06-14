public class MethodsExercises {

    public static void main(String[] args) {
//        System.out.println(add(1, 2));
//        System.out.println(subtract(4, 2));
//        System.out.println(multiply(10, 2));
//        System.out.println(divide(10, 2));
//        System.out.println(modulus(10, 3));
//        System.out.println(bonusMultiply(2, 4));
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int bonusMultiply(int num1, int num2) {
        int total = 0;
        for (int i = 1; i <= num2; i += 1) {
            total += num1;
        }
        return total;
    }
}
