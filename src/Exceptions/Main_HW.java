package Exceptions;

public class Main_HW {
    public static void main(String[] args) {
        int[] arr = new int[10];
            for (int i = 0 ; i < arr.length ; i++) {
                arr[i] = i;
            }
        try {
            for (int j = 0; j <= arr.length; j++) {
                arr[j] = arr[j];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива.");
        }
        finally {
            System.out.println("Пошел нафиг, с новым годом!");
        }
    }
}
