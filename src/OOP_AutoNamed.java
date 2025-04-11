import JavaLearn.AutoName;

public class OOP_AutoNamed {
    public static void main(String[] args) {
        AutoName[] arr = new AutoName[0];

        for (int j = 0; j < 10; j++) {
            arr = AutoName.add_obj_in_arr(arr);
        }

        for (int i = 0; i < arr.length; i++) {
            String out = AutoName.get_name(arr, i);
            System.out.println(out);
        }
    }
}
