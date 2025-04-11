package JavaLearn;

public class ObjAsParam {
        double height;
        double width;
        double length;

    public ObjAsParam(double height, double weight, double length) {
        this.height = height;
        this.width = weight;
        this.length = length;
    }

    public ObjAsParam() {
        this.height = 0;
        this.width = 0;
        this.length = 0;
    }

    public double volume(ObjAsParam obj) {
        return obj.height * obj.length * obj.width;
    }

    public ObjAsParam copy_obj(ObjAsParam obj) {
        this.height = obj.height;
        this.width = obj.width;
        this.length = obj.length;
        return obj;
    }

    public static String show_param(ObjAsParam obj) {
        return "Размер: " + obj.height + " * "  + obj.width + " * " + obj.length;
    }

}
