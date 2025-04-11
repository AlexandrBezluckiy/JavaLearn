package JavaLearn;

public class ObjBox3 {
    double height;
    double width;
    double length;

    private ObjBox3() {
        height = 0;
        width = 0;
        length = 0;
    }

    public ObjBox3(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public ObjBox3(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public static int compare(ObjBox3 obj1, ObjBox3 obj2) {
        double vol1 = obj1.height * obj1.width * obj1.length;
        double vol2 = obj2.height * obj2.width * obj2.length;
        if (vol1 > vol2) {
            return 1;
        }
        else if (vol1 < vol2) {
            return -1;
        }
        else {
            return 0;
        }
    }

    public static void box_resize(ObjBox3 obj, double k) {
        obj.height = obj.height * k;
        obj.width = obj.width * k;
        obj.length = obj.length * k;
    }

    public static ObjBox3 copy_box (ObjBox3 obj) {
        ObjBox3 copy = new ObjBox3();
        copy.height = obj.height;
        copy.width = obj.width;
        copy.length = obj.length;
        return copy;
    }
}
