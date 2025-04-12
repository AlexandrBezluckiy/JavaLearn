import JavaLearn.Access;

public class OPP_Access_HW {
    public static void main(String[] args) {
        Access box1 = Access.set_param(5);
        System.out.println(box1.show_size());
        Access box2 = Access.set_param(10);
        System.out.println(box2.show_size());
        Access box3 = Access.set_param(15);
        System.out.println(box3.show_size());

        box1.set_width(7);
        box1.set_height(8);
        box1.set_length(9);
        System.out.println(box1.show_size());

        System.out.println(box1.get_height());
        System.out.println(box1.get_length());
        System.out.println(box1.get_width());
    }
}
