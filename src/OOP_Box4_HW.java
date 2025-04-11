import JavaLearn.ObjBox4;

public class OOP_Box4_HW {
    public static void main(String[] args) {
        ObjBox4 obj1 = new ObjBox4(5, 5, 5);
        ObjBox4 obj2 = new ObjBox4(5, 5, 5);

        ObjBox4 obj3 = obj1.multiple_box(obj2);
        System.out.println(obj3.get_size());

        ObjBox4 obj4 = new ObjBox4(obj1, obj2);
        System.out.println(obj4.get_size());
    }
}
