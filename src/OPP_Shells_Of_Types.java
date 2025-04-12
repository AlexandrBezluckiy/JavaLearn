import java.lang.reflect.Array;
import java.util.Arrays;

public class OPP_Shells_Of_Types {
    public static void main(String[] args) {
        int i = 0;
        String s = "5";
        i = Integer.parseInt(s);
        System.out.println(i);

        String word = "as df gh jk";
        String[] arr = word.split(" ");
        for (String str : arr) {
            System.out.println(str);
        }

        String s1 = "true4";
        boolean b = Boolean.parseBoolean(s1);
        System.out.println(b);



    }
}
