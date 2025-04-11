package JavaLearn;

public class ObjBox4 {
    double height;
    double width;
    double length;

    public ObjBox4() {
        height = 0;
        width = 0;
        length = 0;
    }

    public ObjBox4(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public ObjBox4(ObjBox4 obj1, ObjBox4 obj2) {
        this.height = (obj1.height + obj2.height) * 2;
        this.width = (obj1.width + obj2.width) * 2;
        this.length = (obj1.length + obj2.length) *2;
    }

    public ObjBox4 multiple_box(ObjBox4 obj) {
        ObjBox4 new_obj = new ObjBox4();
        new_obj.height = this.height + obj.height;
        new_obj.width = this.width + obj.width;
        new_obj.length = this.length + obj.length;
        return new_obj;
    }

    public String get_size() {
        return "Размеры: " + height + " * " + width + " * " + length;
    }


}
