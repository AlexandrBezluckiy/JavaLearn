public class OOP_Box3 {
    public static void main(String[] args) {
        OOP_Box3_Class box = new OOP_Box3_Class();
        box.width = 15;
        box.height = 15;
        box.length = 15;
        box.showVolume();

        double volume = box.Volume();
        System.out.println(volume);
    }
}
