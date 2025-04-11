package JavaLearn;

public class AutoName {
    String name;

    AutoName (String name) {
        this.name = name;
    }

    public static AutoName[] add_obj_in_arr(AutoName[] arr) {
        int count = arr.length;
        String const_name = "Autoname_";
        String name = const_name + count;
        AutoName[] new_arr = new AutoName[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
           new_arr[i] = arr[i];
        }
        arr = new_arr;
        arr[arr.length-1] = new AutoName(name);
        return arr;
    }

    public static String get_name(AutoName[] arr, int index) {
        String out = arr[index].name;
        return out;
    }
}
