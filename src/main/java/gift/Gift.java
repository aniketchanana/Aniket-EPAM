package gift;

import sweets.Sweet;

import java.util.*;

public class Gift {
    ArrayList<Sweet> gifts = new ArrayList<Sweet>();
    public int netWeight(){
        int w = 0;
        for(int i=0;i<gifts.size();i++){
            w += gifts.get(i).getWeight();
        }
        return  w;
    }
    public void add(Sweet sweet){
        gifts.add(sweet);
    }
    public void sort(){
        Collections.sort(gifts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<this.gifts.size();i++){
            sb.append(gifts.get(i).getName());
        }
        return sb.toString();
    }
}
