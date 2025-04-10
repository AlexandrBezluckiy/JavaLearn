public class OOP_Box3_Class {
    double width;
    double height;
    double length;

    public void showVolume(){
        double volume = width * height * length;
        System.out.println(volume);
    }

    public double Volume(){
        double volume = width * height * length;
        return volume;
    }
}
