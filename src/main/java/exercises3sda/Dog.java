package exercises3sda;

public class Dog extends AbstractAnimal implements Animal {
//    private String name;

    public Dog(String name) {
        super(name);
//        this.name = name;
    }

    /* niepoczebuje
    public String getName() {
        return this.name; //odwoluje sie do cechy tej klasy
    }
*/
    @Override
    public void makeSound() {
        System.out.println(this.name + " goes WOOFF WOOOFF");
    }
}
