package exercises3sda;

import lombok.Getter;
import lombok.Setter;

public class Cat {
 //   @Setter
   // @Getter
    private String name;
    private Integer mouseCounter;

    public Cat(String name) {
        this.name = name;
        this.mouseCounter = 0;
    }

    //2gi kosnturkotr, przyjmuj zarowno ilosc zjdzonych myszy
    public Cat(String name, Integer mouseCounter) {
        this.name = name;
        this.mouseCounter = mouseCounter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setMouseCounter(Integer mouseCounter) {
        this.mouseCounter = mouseCounter;
    }

    public Integer getMouseCounter() {
        return this.mouseCounter;
    }

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
}
