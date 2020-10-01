import java.util.List;

abstract class Validator {

    public void validate() {
        String assertion = getAssertion();
        System.out.println(getAssertion());
    }

    abstract String getAssertion();

}

class Chiuka extends Validator {
    @Override
    String getAssertion() {
        return "chiuka";
    }
}

class Validator2 extends Validator {
    @Override
    String getAssertion() {
        return ">5";
    }
}


public class AbstractTutorial {


    public void main(String[] args) {
        List<Validator> v = List.of(new Validator2(), new Chiuka());

        for (Validator validator : v) {
            validator.validate();
        }

    }
}
