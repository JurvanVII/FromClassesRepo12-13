package exercises3sda;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Kazimierz");
        Cat cat2 = new Cat("Mruczek"); // obiekt nazwa zmiennej cat2 new slowko luczowe rezerwuje miejsce w  pameici i klucz plodzi nam obiekt
        Cat cat3 = new Cat("Garfield");
        /*cat1.makeSound();
        cat2.makeSound();
        cat3.makeSound();
    */
        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        for (Cat cat: cats) { //tymczasowa zmienna z malej liteyr cat, zbiornik cats ktory bedziemy wkoryzstywac
            cat.makeSound();
        }

        cat1.eatMouse();
        cat1.eatMouse();
        cat1.eatMouse();

        Dog dog1 = new Dog("Sparta");
        Dog dog2 = new Dog("Stark");
        Dog dog3 = new Dog("Yoshi");

        dog1.makeSound();
        dog2.makeSound();
        dog3.makeSound();
        //stworzymy liste zwierzat, kotow i psow jako trening

        System.out.println("Ex 5");

        List<Animal> animals = new ArrayList<>(); //lista tablica arrayList
        // do animals dodajemy 3 koty i 3 psy
        animals.add(cat1);
        animals.add(cat2);
        animals.add(cat3);
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);

        for (Animal animal:animals ) //Animal typ, zmienna widoczna w zasiegu petli animal,
        {
            animal.makeSound();
        }

        System.out.println("Ex 6");
        Car car1 = new Car();
        car1.move();

        System.out.println("Exercise 7");
        System.out.println(cat1.move()); // jeden jest early ide drugi ide z souta
        System.out.println(cat1); //
        System.out.println(cat1.toString()); // nie mam nadpisane toStringa wiec nie pojdzie // po dodaniu toString w cat z genertrate dziala

        System.out.println("ex 8:");
        //tworzymy obiekt weterynarz
        Vet someVet = new Vet();
        someVet.sayHello(cat2);
        someVet.sayHello(dog1);

        System.out.println("Ex 10");
        someVet.universalSayHello(dog1);
        someVet.universalSayHello(cat3);
    }
}
