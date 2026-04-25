class openClosePrincipal{
    // should be open for extension
    //closed for modification
    
    
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