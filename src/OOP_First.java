public class OOP_First {
    public static void main(String[] args) {
        OOP_Box my_box = new OOP_Box();
        my_box.height = 10.2;
        my_box.width = 15;
        my_box.length = 11.3;

        OOP_Box my_box2 = new OOP_Box(5, 4, 7);

        double volume;

        volume = my_box.height * my_box.width * my_box.length;
        System.out.println("My_box1: " + volume);

        volume = my_box2.height * my_box2.width;
        System.out.println("My_box2: " + volume);
    }
}
