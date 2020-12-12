package exercises3sda;

public class Car implements Movable {
    @Override
    public String move () {
        System.out.println("Jadę, ale jakby wczesniej.");
        return "Driving home for Christmas.";
    }

}
