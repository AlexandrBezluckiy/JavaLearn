import java.util.ArrayList;

public class OOP_Collection_HW {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(i);
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");
        names.add("Jack");
        names.add("Smith");
        names.add("Alex");
        names.add("Bob");
        names.add("Joan");
        names.add("Jine");

        ArrayList<String> info = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            info.add(nums.get(i) + " - " + names.get(i));
        }

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(info.get(i));
        }
    }
}
