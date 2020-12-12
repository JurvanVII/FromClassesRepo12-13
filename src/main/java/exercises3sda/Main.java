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

    }
}
