public class Customer {


    // ------------------UML seg 2: Characteristics-----------------------------------------------

    private String name;
    // wallet is represented through the datatype integer- because its money
    private int wallet;

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

    public int BuyingMethod(Artwork artwork, Customer customer)
    // input parameters is object from  Artwork class, and object from CustomerClient

    {
        // wallet amount of customer is going to be initial wallet amount - price of painting

        wallet= getWallet();

        wallet= wallet- artwork.getPrice();

       // reducing amount in gallery till

        // Buying method returns and integer which is the wallet amount

        System.out.println("Thankyou " + customer.getName() + " for your purchase of " + artwork);

        System.out.println("Your remaining balance is: £" + wallet );

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
