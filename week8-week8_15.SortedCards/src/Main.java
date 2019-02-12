import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Card first = new Card(10, Card.HEARTS);
    Card second = new Card(10, Card.SPADES);

      System.out.println(first.compareTo(second));
    }
}
