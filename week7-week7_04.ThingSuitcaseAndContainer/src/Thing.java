public class Thing {
    private int weight;
    private String name;

    public Thing(String name, int weight) {
        this.weight = weight;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public String toString() {
        return this.name + "(" + this.weight + " kg)";
    }
}
