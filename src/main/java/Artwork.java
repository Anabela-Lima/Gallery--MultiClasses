import java.util.UUID;

public class Artwork {


    // ------------------UML seg 2: Characteristics-----------------------------------------------

    private String title;
    private String artist;
    private int price;
    // for the nft, it must have a unique number and not have been used before use UUID :
    // this represents an immutable universally unique identifier. the util UUID is imported into the file
    private UUID nft;

    //----------------------UML seg 3.1 : Constructors--------------------------------------------


    public Artwork(String title, String artist, int price, UUID nft) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
    }

    //----------------------UML seg 3.2 Getters and Setters------------------------------------------

    // Auto generated using: [Command] + n and edited each getter to return this.[characteristic]


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public UUID getNft() {
        return nft;
    }

    public void setNft(UUID nft) {
        this.nft = nft;
    }


    @Override
    public String toString() {
        return "Artwork{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", price=" + price +
                ", nft=" + nft +
                '}';
    }
}
