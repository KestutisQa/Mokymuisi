import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {

        Date dabartineData = new Date();

      //  System.out.println(dabartineData);

        SimpleDateFormat laikoFormavimas = new SimpleDateFormat("hh:mm:ss");

        System.out.println(laikoFormavimas.format(dabartineData));

        SimpleDateFormat datosFormavimas = new SimpleDateFormat("mm/dd/yyyy");
        System.out.println(datosFormavimas.format(dabartineData));








    }

}
