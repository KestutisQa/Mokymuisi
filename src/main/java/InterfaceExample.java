interface Fun {

    String color = "Red";

    void fillUp();
}

public class InterfaceExample implements Fun {
    public static void main(String[] args) {
        System.out.println(color);

        InterfaceExample ex = new InterfaceExample();
        ex.fillUp();
    }

    @Override
    public void fillUp() {
        System.out.println("its filled");

    }
}
