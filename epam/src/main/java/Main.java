import sweets.*;
import gift.*;
public class Main {
    public static void main(String[] args) {
        Sweet a = new Chocolate("a",100,80,"dairymilk");
        Sweet b = new Chocolate("b",200,90,"motherdairy");
        Sweet c = new Candy("k",1001,88,"adia");

        Gift gifts = new Gift();
        gifts.add(a);
        gifts.add(b);
        gifts.add(c);

        System.out.println(gifts.netWeight());
        System.out.println(gifts.toString());
    }
}
