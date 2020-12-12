package exercises3sda;

public class Vet {

    public void sayHello(Cat someCat) { //przyjumje obiekt typu kot, nazwa typu zmiennje
        System.out.println("Hello Kitty! Your name is " + someCat.getName());
    }
    //zad8
    public void sayHello(Dog someDog) { //java rozroznia bo ma inny argument
        System.out.println("Hello beautiful Doggy. Your name is " + someDog.getName());
    }
    }
