import java.util.ArrayList;
import java.util.Collections;

public class Hand implements java.lang.Comparable<Hand> {
    private ArrayList<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<Card>();
    }
    
    public void add(Card card){
        cards.add(card);
    }
    
    public void print(){
        for(Card card : cards){
            System.out.println(card.toString());
        }
    }
    
    public void sort(){
        Collections.sort(cards);
    }
    
    public int size(){
        int size = 0;
        for (Card cards : this.cards){
        size += cards.getValue();
        }
        
        return size;
    }
    
    public void sortAgainstSuit(){
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }

    @Override
    public int compareTo(Hand hand) {
      
        if(this.size() == hand.size()){
            return 0;
        }
        else if(this.size() > hand.size()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
