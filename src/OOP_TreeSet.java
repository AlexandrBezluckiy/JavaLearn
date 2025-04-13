import java.util.TreeSet;

public class OOP_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(5);
        nums.add(3);
        nums.add(7);
        nums.add(1);
        nums.add(4);
        nums.add(5);
        nums.add(7);

        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}
