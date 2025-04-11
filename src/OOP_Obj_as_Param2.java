import JavaLearn.ObjBox2;

public class OOP_Obj_as_Param2 {
    public static void main(String[] args) {
        ObjBox2 box1 = new ObjBox2(5, 5, 5);
        ObjBox2 box2 = new ObjBox2(5, 5, 5);

        String out = ObjBox2.volume_compare(box1, box2);
        System.out.println(out);

        box2 = box2.resize_box(box1, 0.3);

        System.out.println(box1 + ", " + box2); // проверяем что это разные объекты;

        System.out.println(ObjBox2.show_param(box1));
        System.out.println(ObjBox2.show_param(box2));

        out = ObjBox2.volume_compare(box1, box2);
        System.out.println(out);
    }
}
