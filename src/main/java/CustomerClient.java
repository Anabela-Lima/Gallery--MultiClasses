import java.util.UUID;

public class CustomerClient{

    public static void main(String[] args) {

        // 1. Create a class with a main method: main+[tab] , this tells java this is the entry point to our application





        // 3.1. Generate Constructors---------------------------------------------------------------
/*

      Why?   when we create objects, we say that they are of the class type implying they have the characteristics
             the class, right?

             A Constructor is responsible for passing the characteristics of the class to the object.

             so we need to create constructors in every class file so that when we create a new object, they are by
             definition part of that class, since they have the class characteristics.

  */


        // 3.2 . Getters and Setters----------------------------------------------------------------


/*
         1. A customer has a name, and a wallet amount
         2. A gallery has a name, a till amount, and a collection of artwork
         3. An Artwork has a title, an artists, a price and an nft

          Generate Getters and Setters for all of these (+ the artist too) in their respective files- done

 */

        //  Create object of class type-------------------------------------------------------------------------------

        //   We want the customer to be able to buy Artwork from the Gallery.
        //   So we need to  create an object of class type: Customer, Gallery, and Artwork


    /*
          Note: Gallery class has format: (string, int, array list) and therefore so should objects belonging to the class.
             In Gallery.java  I  removed array list from constructor, so it wouldn't pass the characteristic of
             array list to the gallery object that I created here (i.e,. gallery1) that way I don't have to write an array
             list) since im not passing the arraylist characteristic from the gallery class, onto the object.
             I want to be able to add Artwork to the gallery manually instead. I did the same thing with the artist
            the artwork for the artist's collection will be added manually

   */
        Customer customer1 = new Customer("Ana Bela", 2000);
        Gallery gallery1 = new Gallery( "Paula Galeria", 500);

        Artwork Artwork1 = new Artwork("Doreatta", "Phillip", 250, UUID.randomUUID());
        Artwork Artwork2 = new Artwork("Carlina", "Rodi", 500, UUID.randomUUID());
        Artwork Artwork3 = new Artwork("RedVelvet", "Rose", 100, UUID.randomUUID());
        Artwork Artwork4 = new Artwork("Abstract Day", "Polonia", 50, UUID.randomUUID());
        Artwork Artwork5 = new Artwork("Timeless counter", "Streveji", 1750, UUID.randomUUID());
        Artwork Artwork6 = new Artwork("Dystopia", "Ester", 4500, UUID.randomUUID());
        Artwork Artwork7 = new Artwork("Summer Landscape", "Phillip", 350, UUID.randomUUID());

        Artist Artist1 = new Artist("Phillip");



        //    Buying Artwork from Gallery Method------------------------------

/*
         Now that we have our objects created, we need to make the customer (customer1) buy the Artwork from
         the gallery (gallery1)

          So customer needs to have a method of purchase- create that- [ created it's called BuyingMethod ]
 */



        //   Increasing Gallery till amount ------------------------------

/*
         I also need to create a method to increase the till amount- This must be written in the Gallery class
         because only that class has access to characteristic:till amount if  I try to call till amount from another
         class it won't work because those characteristics are set private meaning only available to class in which
         they are created in.

           So Gallery needs to have a method of increasing till amount- create that- [ Created it's called TillMethod ]

 */

        // Adding Artwork to the gallery1 collection  i.e. arraylist  -------------------------------------------------

//        Next, we want the Artwork objects to be added to the gallery 1
//        recall:  A Gallery should have a collection of Artwork- I am adding Artwork to gallery1

        gallery1.getGalleryArtwork().add(Artwork1);
        gallery1.getGalleryArtwork().add(Artwork2);
        gallery1.getGalleryArtwork().add(Artwork3);
        gallery1.getGalleryArtwork().add(Artwork4);
        gallery1.getGalleryArtwork().add(Artwork5);
        gallery1.getGalleryArtwork().add(Artwork6);

    // Printing Gallery1 Collection -------------------------------------------------------------------------------


        System.out.println(gallery1.getGalleryArtwork());


//   ------------------------------------------------------------------------------------------------------------------

        // Adding Artist1's work to their collection i.e array list ---------------------------------------------------

//    recall: An Artist should have a name and a collection of artwork (i.e a list of artwork they have personally made)

        Artist1.getArtistArtwork().add(Artwork1);
        Artist1.getArtistArtwork().add(Artwork7);

        System.out.println(Artist1.getArtistArtwork());



        //   Print ----------------------------------------------------------------------------------------------

       // printing customer balance before purchase:

        System.out.println( customer1.getName()+ ", your wallet amount before purchase is £" + customer1.getWallet());

        //  Customer 1 buys a painting :

        System.out.println( customer1.BuyingMethod(customer1,Artwork1,gallery1));

        // gallery1 amount after purchase
        System.out.println( gallery1.TillMethod(gallery1.getTill(),Artwork1,gallery1 ));


        // checking Gallery value- for gallery 1- created a stock method that adds price of each painting;

//        System.out.println(gallery1.stock_takeMethod(gallery1));  [IN PROGRESS ]
















    }




}