import JavaLearn.ObjBox3;

public class OOP_Obj_as_Param3 {
    public static void main(String[] args) {
        ObjBox3 obj1 = new ObjBox3(5, 6, 7);
        ObjBox3 obj2 = ObjBox3.copy_box(obj1);

        System.out.println(obj1 + ", " + obj2);

        ObjBox3.box_resize(obj1, 0.5);

        int compare = ObjBox3.compare(obj1, obj2);
        switch (compare) {
            case 0:
                System.out.println("Коробки равны.");
                break;
            case 1:
                System.out.println("Первая коробка больше.");
                break;
            case -1:
                System.out.println("Вторая коробка больше.");
        }
    }
}
