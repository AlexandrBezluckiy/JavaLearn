package JavaLearn;

public class Persons {
    public static String[] add_staff(String[] arr, String newName) {
        String[] newArr = new String[arr.length + 1];
        for (int i = 0;  i< arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = newName;
        return newArr;
    }
/*
    public static String[] remove_staff(String[] arr, String remName) {
        int index = 0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i].equals(remName)) {
                index = i;
            }
        }
        String[] newArr = new String[arr.length - 1];
        int shift = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (i == index) {
                shift ++;
            }
            newArr[i] = arr[i+shift];
        }
        return newArr;
*/
    public static String[] remove_staff(String[] arr, String remName) {
        for (int i = 0; i < arr.length; i++ ) {
            if (arr[i].equals(remName)) {
                arr[i] = null;
            }
        }
        String[] newArr = new String[arr.length - 1]; {
            for (int i = 0, j = 0; i < newArr.length; i++, j++) {
                if (arr[j] == null) {
                    j++;
                }
                newArr[i] = arr[j];
            }
            return newArr;
        }
    }
}
