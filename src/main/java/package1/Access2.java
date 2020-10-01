package package1;

import pacakge2.Access3;

public class Access2 {
    public static void main(String[] args) {

        Access1 access1 = new Access1();

        System.out.println(access1.hours);
        System.out.println(access1.minutes);

        Access3 access3 = new Access3();

        System.out.println(access3.hours);
        System.out.println(access3.minutes);

    }
}