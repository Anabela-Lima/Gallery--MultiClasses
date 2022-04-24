import java.util.ArrayList;
import java.util.UUID;

public class Gallery {

//     UML Diagram segment 2:  Set Characteristics/ properties:

//     Note, every Gallery we create is going to have these characteristics

// ------------------UML seg 2: Characteristics-----------------------------------------------

    // name is represented by string
    private String name ;
    // till amount is represented through an integer
    private int till;
    // collection of Artwork in the gallery is represented by an array list called GalleryArtwork.
    // The ArrayList contains <Artwork> so each element in the GalleryArtwork
    // has the characteristics of an Artwork class- i.e. title, artist, price, nft
   private ArrayList<Artwork> GalleryArtwork = new ArrayList<>();



//-------------------UML seg 3.1 : Constructors---------------------------------------------

    public Gallery(String name, int till) {
        this.name = name;
        this.till = till;

    }


//-------------------UML seg 3.2 : Getters and Setters------------------------------------------

    // Auto generated using: [Command] + n and edited each getter to return this.[characteristic]

    public String getName() {               // When we .getname, e.g. customer1.getname, we are getting
                                            // the name we set in setter - we do this in the clientCode

        return this.name;
    }

    public void setName(String name) {        // here we are setting the name: this.name = name
        this.name = name;
    }

    public int getTill() {
        return  this.till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public ArrayList<Artwork> getGalleryArtwork() {
        return this.GalleryArtwork;
    }

    public void setGalleryArtwork(ArrayList<Artwork> galleryArtwork) {
        GalleryArtwork = galleryArtwork;
    }


    // till increasing  method ------------------------------------------

    public int TillMethod (int till, Artwork artwork, Gallery gallery )

    // parameters tillMethod takes  are till integer, and Artwork

    {
        till = getTill() + artwork.getPrice();

        System.out.println( "Previous till amount for " + gallery.getName() + " was: "  + "£"+ gallery.getTill());

        System.out.println("New Till amount for " + gallery.getName() + " after purchase is: £" + till);




        return (till);



    }


    @Override
    public String toString() {
        return "Gallery{" +
                "name='" + name + '\'' +
                ", till=" + till +
                ", GalleryArtwork=" + GalleryArtwork +
                '}';
    }

    //  Extension taskStock take method [IN PROGRESS ] -------------------------------------------------------------------------------

    // Give the Gallery the ability to calculate the value of its collection with a stock_take() method.

//
//    public String stock_takeMethod(Gallery gallery)
//
//    {   gallery.getGalleryArtwork();
//        gallery.getGalleryArtwork().indexOf("price");
//        System.out.println (gallery.getGalleryArtwork().indexOf("price"));
//        System.out.println(gallery.getGalleryArtwork());
//
//
//
//        return ("fsd");

//
//        int sum = 0;
//
//        for (int i = 0; i == gallery.getGalleryArtwork().size() - 1; i++) {
//
//            System.out.println(gallery.getGalleryArtwork().size() - 1);
//
//
//            sum = sum + gallery.getGalleryArtwork().get(i);


          //  System.out.println(sum);

//        }
//
//        return (sum);








}
