import com.sun.source.tree.IfTree;

public class UnderstandingEquality {



    public static void main(String[] args) {

        String a = "Nortal";
        String b = "Nortal";
        String Str1 = ("Thiss is really not immutable!!");
        String Str2 = Str1;
        String Str3 = ("Thiss is really not immutable!!");

        boolean truFalse;

        truFalse = Str1.equals( Str2 );
        System.out.println("Grazinta reiksme = " + truFalse );

        truFalse = Str1.equals( Str3 );
        System.out.println("RGrazinta reiksme = " + truFalse );

        if (a == b ){
            System.out.println("tiesa");

        }else {
            System.out.println("netiesa");
        }


    }
}