public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int pubYear;
    private double weight;
    
    public CD(String artist, String title, int pubYear){
        this.artist = artist;
        this.title = title;
        this.pubYear = pubYear;
        this.weight = 0.1;
    }
    
    public double weight(){
        return this.weight;
    }
    
    @Override
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.pubYear + ")";
    }
}
