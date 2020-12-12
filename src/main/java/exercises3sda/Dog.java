package exercises3sda;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name; //odwoluje sie do cechy tej klasy
    }

    @Override
    public void makeSound() {
        System.out.println(name + " goes WOOFF WOOOFF");
    }
}
