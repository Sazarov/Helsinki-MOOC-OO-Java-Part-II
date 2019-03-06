public class Book implements ToBeStored {
    private double weight;
    private String writer;
    private String name;

    public Book(String writer, String name, double weight) {
        this.weight = weight;
        this.writer = writer;
        this.name = name;
    }

    @Override
    public double weight() {
        return weight;
    }

    public String toString() {
        return writer + ": " + name;
    }
}
