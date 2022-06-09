public class JavaSyntaxLecture {

    public static void main(String[] args) {

        int weight;
        String breed;

        weight = 10;
        breed = "Cavalier King Charles Spaniel";

        String name = "Grinch";

        int cutenessFactor;
        cutenessFactor = 10;

//        System.out.println(name + " is a " + weight + " pound " + breed);

//        if (cutenessFactor > 8){
//            System.out.println(name + " is cute.");
//        } else {
//            System.out.println(name + " is one ugly dog, but I still love it");
//        }

        byte smol = 12;
//        System.out.println(smol);

        long big = 9000000000L;
//        System.out.println(big);

//        big = smol;
//        System.out.println(big);
        smol = (byte) big;
//        System.out.println(smol);

        float imafloat;
        double imadouble = 9.012345678901;
//        System.out.println(imadouble);
        imafloat = (float) imadouble;
//        System.out.println(imafloat);

        imafloat = 2.3F;

//        int x = 4;
//        x = x + 5;
//        x += 5;
//        System.out.println(x);

        int x = 10;
        int y = 2;
//        x = x / y;
        x /= y;
//        y = y - x;
        y -= x;

        System.out.println(y);
    }
}
