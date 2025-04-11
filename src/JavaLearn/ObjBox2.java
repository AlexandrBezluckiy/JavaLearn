package JavaLearn;

public class ObjBox2 {
    double height;
    double width;
    double length;

    private ObjBox2() {
        height = 0;
        width = 0;
        length = 0;
    }

    public ObjBox2(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public static String volume_compare(ObjBox2 obj1, ObjBox2 obj2) {
        double volume1 = obj1.height * obj1.length * obj1.width;
        double volume2 = obj2.height * obj2.length * obj2.width;
        if (volume1 > volume2) {
            return "Первая коробка больше.";
        }
        else if (volume1 < volume2) {
            return "Вторая коробка больше.";
        }
        else {
            return "Коробки равны.";
        }
    }
    public ObjBox2 resize_box(ObjBox2 obj, double k) {
        ObjBox2 res_box = new ObjBox2();
        res_box.height = obj.height * k;
        res_box.width = obj.width * k;
        res_box.length = obj.length * k;
        return res_box;
    }

    public static String show_param(ObjBox2 obj) {
        return "Размер: " + obj.height + " на " + obj.width + " на " + obj.length;
    }
}
