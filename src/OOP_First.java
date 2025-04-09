public class OOP_First {
    public static void main(String[] args) {
        OOP_Box my_box = new OOP_Box();
        my_box.height = 10.2;
        my_box.width = 15;
        my_box.length = 11.3;

        OOP_Box my_box2 = new OOP_Box(5, 4, 7);

        OOP_Box my_box3 = new OOP_Box(19.7);

        double volume;

        volume = my_box.height * my_box.width * my_box.length;
        System.out.println("My_box1: " + volume);

        volume = my_box2.height * my_box2.width * my_box2.length;
        System.out.println("My_box2: " + volume);

        volume = my_box3.height * my_box3.width * my_box3.length;
        System.out.println("My_box3: " + volume);
    }
}
