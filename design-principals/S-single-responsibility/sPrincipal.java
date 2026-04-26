class sPrincipal{
    // one class should have only one principal

 


}

class Item{
       int price;
       String name;
}

class ShoppingCart{
    void calculatePrice(){

    }

    void printInvoice(){

    }

    void saveToDatabase(){

    }

    // this class has more than one responsibility
    //IF MORE THAN ONE RESPONSIBILITY THEN COUPLING HAPPENS

}

//better way to do it is:

// class shoppingCart should only print price
// db should only save to database
// invoice should only print invoice

// both db and invoice should use shoppingCart to get price and other details