public class CreatingAndManipulatingStrings {



    public static void main(String[] args) {
//sudeda i viena zodi
        char[] nortalArray = {'n', 'o', 'r', 't', 'a', 'l'};
        String nortalString = new String(nortalArray);
        System.out.println(nortalString);

// istraukia is stringo zodzio ilgi
           String testasTestukas = "labas rytas Lietuva";
           int len = testasTestukas.length();
           System.out.println( "Zodzio ilgis : " + len );

        String la = "la";
        String la1 = "la1";

        String a = la.concat(la1);

        System.out.println(a);



        String fs;
        fs = String.format("The value of the float variable is " +
                 "%s, while the value of the integer " +
//                 "variable is %d, and the string " +
                 "is %s", "KESTAS", "Mindaugas");
        System.out.println(fs);

 //Palyginam stringus
        String Str1 = ("Thiss is really not immutable!!");
        String Str2 = Str1;
        String Str3 = ("Thiss is really not immutable!!");

        boolean truFalse;

        truFalse = Str1.equals( Str2 );
        System.out.println("Grazinta reiksme = " + truFalse );

        truFalse = Str1.equals( Str3 );
        System.out.println("RGrazinta reiksme = " + truFalse );

    }
}