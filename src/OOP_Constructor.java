public class OOP_Constructor {
    public static void main(String[] args) {
        OOP_Constructor_Class box1 = new OOP_Constructor_Class();
        System.out.println(box1.volume());

        OOP_Constructor_Class box2 = new OOP_Constructor_Class(7, 8, 9);
        System.out.println(box2.volume());

        OOP_Constructor_Class box3 = new OOP_Constructor_Class(9);
        System.out.println(box3.volume());
    }
}
