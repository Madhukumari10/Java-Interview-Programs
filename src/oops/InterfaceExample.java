package oops;

interface Payment {

    void pay();
}

class CreditCardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment made using Credit Card");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {

        Payment payment = new CreditCardPayment();

        payment.pay();
    }
}
