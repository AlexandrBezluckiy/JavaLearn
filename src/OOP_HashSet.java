import java.util.HashSet;

public class OOP_HashSet {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("Ivan");
        names.add("Ivanov");
        names.add("Ivan");
        names.add("Vlad");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
