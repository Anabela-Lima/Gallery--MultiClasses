import java.util.ArrayList;
import java.util.List;

public class Customer {


    // ------------------UML seg 2: Characteristics-----------------------------------------------

    private String name;
    // wallet is represented through the datatype integer- because its money
    private int wallet;

    // Customer will have a collection of Artwork represented by an arraylist called Customer collection.
    // This is a new arraylist- starts off empty

    private ArrayList<Artwork> CustomerCollection = new ArrayList<>();

    //----------------------UML seg 3.1 : Constructors------------------------------------------------

    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    //----------------------UML segment 3.2 : Getters and Setters----------------------------------

    // Auto generated using: [Command] + n and edited each getter to return this.[characteristic]


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return this.wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }



    //----------------------UML segment 3.3 : Purchase Method ----------------------------------

    // A Customer should be able to buy an Artwork from the Gallery, reducing the money in their wallet
    // and increasing the money in the Gallery till.

    public int BuyingMethod(Customer customer,Artwork artwork , Gallery gallery)
    // input parameters is object from  Artwork class, and object from CustomerClient

    {


        // wallet amount of customer is going to be initial wallet amount - price of painting

        wallet= getWallet();

        wallet= wallet- artwork.getPrice();

        // reducing amount in gallery till

        // Buying method returns and integer which is the wallet amount

        System.out.println("Thankyou " + customer.getName() + " for your purchase of " + artwork);

        System.out.println("Your remaining balance is: £" + wallet );

           // remove the artwork from the gallery

            System.out.println( "Our available Artwork : " + gallery.getGalleryArtwork());
            gallery.getGalleryArtwork().remove(artwork);

            // what's left in the gallery

            System.out.println( "Our Remaining Artwork :" + gallery.getGalleryArtwork());

            // customer collection

            customer.CustomerCollection.add(artwork);

        System.out.println( customer.getName()+ " Your artwork colelction is " +  customer.CustomerCollection);


        return (wallet);

        }





    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", wallet=" + wallet +
                '}';
    }

}
