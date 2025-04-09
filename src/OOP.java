import JavaLearn.Box;

public class OOP {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.set_value(15.5,5.7, 6.3);
        myBox.get_value();

        double volume = myBox.get_volume(myBox);
        System.out.println(volume);
    }
}
