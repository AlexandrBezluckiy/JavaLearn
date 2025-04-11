import JavaLearn.ObjAsParam;

public class OOP_Object_as_Param {
    public static void main(String[] args) {

        ObjAsParam obj1 = new ObjAsParam(3, 4, 7);
        double volume = obj1.volume(obj1);
        System.out.println(volume);

        ObjAsParam obj2 = new ObjAsParam();
        obj2 = obj2.copy_obj(obj1);

        System.out.println(ObjAsParam.show_param(obj2));
    }
}
