package exercises3sda;

public abstract class AbstractAnimal { //klasa abstarkcyjna
    protected String name;

    public AbstractAnimal(String name) { //musi miec konstruktor ktory bedzie przyjmowal to imie

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) { //konstrukotr zahcowuje sie podobnie jak setter wiec (name) zeby go ustawic
        this.name = name;
    }
}
