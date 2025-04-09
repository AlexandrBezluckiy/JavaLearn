public class Second_Array {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 10;
        }
/*
        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }
*/
        for (int j : nums) {
            System.out.println(j);
        }
    }
}
