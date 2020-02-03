package sweets;

public class Sweet implements Comparable<Sweet> {
    private String name;
    private int price;
    int weight;

    public Sweet(String name,int price,int weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Sweet name = " + this.name + " weight = " + this.weight + " price " + this.price;
    }

    public int compareTo(Sweet o) {
        return this.getPrice()-o.getPrice();
    }
}
