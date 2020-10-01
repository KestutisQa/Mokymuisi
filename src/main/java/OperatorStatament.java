import javax.sound.midi.Soundbank;


// operatoriai ==  < > ir t.t
public class OperatorStatament {

    public static void main(String[] args) {


        int a = 1;
        int b = 10;

        boolean c = (a == b);

        System.out.println(c);

        method4(args);

        System.out.println(args);

    }

    public static void method1(String[] args) {
        double a = 1.1;
        int b = 14;

        boolean c = (a == b);
        System.out.println(c);

        boolean d = (a > b);
        System.out.println(d);
    }

    public static void method2(String[] args) {
        double a = 1.1;
        int b = 14;

        boolean c = (a == b);
        System.out.println(c);

        boolean d = (a > b);
        System.out.println(d);
    }

    public static void method3(String[] args) {

        String name = "kestas";

        System.out.println(name);


    }

    public static void method4(String[] args) {

        double a = 4;

        if (a == 2.4) {
            System.out.println("TAIP");


        } else
            if (a !=2.4) {
                System.out.println("makaronas");
            }
    }
}