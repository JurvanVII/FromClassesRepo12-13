package exercises3sda;

import lombok.Getter;
import lombok.Setter;

public class Cat extends AbstractAnimal implements Animal, Movable {
    //   @Setter
    // @Getter
//    private String name; dzieki super niepotrzebny
    private Integer mouseCounter;

    public Cat(String name) {
        super(name); //metoda super konsturkoter
//        this.name = name; niepotrzebny od super
        this.mouseCounter = 0;
    }

    //2gi kosnturkotr, przyjmuj zarowno ilosc zjdzonych myszy
    public Cat(String name, Integer mouseCounter) {
        super(name);
//        this.name = name; nadpisane w konstuktore, niepotrzne od super
        this.mouseCounter = mouseCounter;
    }
/* nipotrzeny od super
    public void setName(String name) {
        this.name = name;
    }*/
/* niepotrzebny od super
    public String getName() {
        return this.name;
    }
*/
    public void setMouseCounter(Integer mouseCounter) {
        this.mouseCounter = mouseCounter;
    }

    public Integer getMouseCounter() {
        return this.mouseCounter;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + "goes meooooww!");
    }

    public void eatMouse() {
        //zlicza zjedzone myszy i drkujue wynik
        //jak zapmameitasz czy dana isntacja/obiekt kota zjadl mysz? obiektowosc moze przechowywwac swoej atrybuty
        //mzoe przechowywac imie, ilosc zjedoznych myszy/ ddoac icznik jako atrybut wyzej, pod String name
        this.mouseCounter++;
//        this.mouseCounter = this.mouseCounter + 1
        System.out.println("Zjadlem myszy " + mouseCounter);
    }

    @Override
    public String move() {
        System.out.println("Early Idę!");
        return "Idę.";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", mouseCounter=" + mouseCounter +
                '}';
    }
}
