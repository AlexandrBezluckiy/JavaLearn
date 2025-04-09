public class OOP_First {
    public static void main(String[] args) {
        OOP_Box my_box1 = new OOP_Box();
        my_box1.height = 10.2;
        my_box1.width = 15;
        my_box1.length = 11.3;

        OOP_Box my_box2 = new OOP_Box(5, 4, 7);

        OOP_Box my_box3 = new OOP_Box(19.7);

        double volume;

        volume = my_box1.height * my_box1.width * my_box1.length;
        System.out.println("My_box1: " + volume);

        volume = my_box2.height * my_box2.width * my_box2.length;
        System.out.println("My_box2: " + volume);

        volume = my_box3.height * my_box3.width * my_box3.length;
        System.out.println("My_box3: " + volume);

        OOP_Box[] arr = new OOP_Box[3];
        arr[0] = my_box1;
        arr[1] = my_box2;
        arr[2] = my_box3;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("My_box" + (i+1) + ": " + arr[i].get_volume(arr[i]));
        }
    }
}
