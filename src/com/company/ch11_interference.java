package com.company;

//lets learn interface with blackpinkAlbum
interface AlbumContols {
    void play();
    void pause();

    default void skip() {
        System.out.println("hey skip it");
    }

    // Commented to avoid compile error
    // private void secret() {
    //     System.out.println("Secret draft song");
    // }
}

interface PaymentGateway {
    void pay(double amount);

    default boolean validateAmount(double amount) {
        if (amount <= 0) return false;
        return logValidation(amount);
    }

    private boolean logValidation(double amount) {
        System.out.println("Validated amount: " + amount);
        return true;
    }
}

class BlackpinkAlbum implements AlbumContols {
    public void play() {
        System.out.println("Du-ddu-du-ddu-du is now playing!");
    }

    public void pause() {
        System.out.println("Paused… see you later, Blink!");
    }
}

class childpay implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paying ₹" + amount);
    }
}

public class ch11_interference {
    public static void main(String[] args) {
        AlbumContols object = new BlackpinkAlbum();
        object.play();
        object.pause();
        object.skip(); // default method

        PaymentGateway ob = new childpay();
        ob.pay(900000);
        System.out.println(ob.validateAmount(80.00)); // 👈 print result
    }
}