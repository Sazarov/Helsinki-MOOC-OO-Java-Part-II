public class CD implements ToBeStored {
    private double weight = 0.1;
    private String artist;
    private String title;
    private int year;

    public CD(String artist, String title, int year) {
        this.artist = artist;
        this.year = year;
        this.title = title;
    }

    @Override
    public double weight() {
        return weight;
    }

    public String toString() {
        return artist + ": " + title + " (" + year + ")";
    }
}
