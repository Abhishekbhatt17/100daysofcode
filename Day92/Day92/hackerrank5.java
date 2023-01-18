package Day92;

public class hackerrank5 {

    public static void main(String[] args) {
        Adder inherit = new Adder();
        System.out.println("My superclass is: " + inherit.getClass().getSuperclass().getName());
        System.out.print(inherit.add(32,10) + " " + inherit.add(10, 3) + " " + inherit.add(10, 10) + "\n");
    }
}
class Arithmetic {

    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {

}

