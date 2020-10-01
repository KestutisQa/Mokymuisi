public class Overloading {


    // Metodas tuo paciu pavadinimu bet gali tureti skirtingus operatorius
    // Overloaded sum(). This sum takes two int parameters
    public static int Overloading(int x, int y)
    {
        return (x + y);
    }

    // Overloaded sum(). This sum takes three int parameters
    public int Overloading(int x, int y, int z)
    {
        return (x + y + z);
    }

    public int Overload(int x, int y, int z)
    {
        return (x + y + z);
    }

    // Overloaded sum(). This sum takes two double parameters
    public double Overloading(double x, double y)
    {
        return (x + y);
    }

    // Driver code
    public static void main(String args[])
    {
        Overloading s = new Overloading();
        System.out.println(s.Overloading(10, 20));
        System.out.println(s.Overloading(10, 20, 30));
        System.out.println(s.Overloading(10.5, 20.5));
    }
}

