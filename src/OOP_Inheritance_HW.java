import JavaLearn.ParentBox;
import JavaLearn.ChildBox;

public class OOP_Inheritance_HW {
    public static void main(String[] args) {
        ParentBox parentBox = new ParentBox(15);
        ChildBox childBox = new ChildBox(10, 10, 10, 15);

        parentBox.showInfo();
        System.out.println("\n");
        childBox.showInfo();
    }
}
