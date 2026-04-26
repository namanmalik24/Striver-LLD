class openClosePrincipal{
    // should be open for extension
    //closed for modification
    // do not change existing code to add new functionality
    // use interface and then implement that interface 
    
    
    public static void main(String[] args) {
        Payment cardPayment = new CardPayment();
        cardPayment.pay();
        
        Payment upiPayment = new UpiPayment();
        upiPayment.pay();
    }

}

abstract class Payment {
    public abstract void pay();
}

class CardPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Processing card payment");
    }
}

class UpiPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Processing UPI payment");
    }
}