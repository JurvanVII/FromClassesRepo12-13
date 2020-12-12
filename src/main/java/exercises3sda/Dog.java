package exercises3sda;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " goes WOOFF WOOOFF");
    }
}
