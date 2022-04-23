import java.util.ArrayList;
import java.util.UUID;

public class Artist {

     // ------------------UML seg 2: Characteristics---------------------------------------

    private String name;

    // Collection of Artist's artwork is represented through an array called ArtistArtwork
    // The array list contains items from the class Artwork.
    // So each element in the Artist's collection (ArtistArtwork) has the characteristics
    // of the Artwork class i.e. a title, an artist , price, and nft

    private ArrayList<Artwork> ArtistArtwork =  new ArrayList<>();


    //-------------------UML seg 3.1 : Constructors------------------------------------------------

    public Artist(String name) {
        this.name = name;

    }


    //--------------------UML seg 3.2 :Getters and Setters------------------------------------------

    // Auto generated using: [Command] + n and edited each getter to return this.[characteristic]


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Artwork> getArtistArtwork() {
        return ArtistArtwork;
    }

    public void setArtistArtwork(ArrayList<Artwork> artistArtwork) {
        ArtistArtwork = artistArtwork;
    }





}
