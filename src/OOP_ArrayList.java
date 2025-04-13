import java.util.ArrayList;

public class OOP_ArrayList {
    public static void main(String[] args) {
/*
        ArrayList<String> employes = new ArrayList<>();
        employes.add("Ivan");
        employes.add("Petya");
        employes.add("Sam");
        employes.add("Raj");
        employes.add("Mike");

        for (int i = 0; i < employes.size(); i++) {
            System.out.println(employes.get(i));
        }
        employes.remove(0);
        employes.remove("Mike");

        for (String employe : employes) {
            System.out.println(employe);
        }
*/
        ArrayList<Integer> nums = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            nums.add(i);
        }
        for (Integer num : nums) {
            sum += num;
        }
        System.out.println(sum);
    }
}
