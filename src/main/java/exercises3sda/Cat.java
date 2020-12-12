package exercises3sda;

import lombok.Getter;
import lombok.Setter;

public class Cat {
    @Setter
    @Getter
    private String name;
    public Cat (String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(this.name + "goes meooooww!");
    }
}
