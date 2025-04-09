public class First_Array {
    public static void main(String[] args) {
        int[] DaysInMonth = new int[12];
        DaysInMonth[0] = 31;
        DaysInMonth[1] = 28;
        DaysInMonth[2] = 31;
        DaysInMonth[3] = 30;
        DaysInMonth[4] = 31;
        DaysInMonth[5] = 30;
        DaysInMonth[6] = 31;
        DaysInMonth[7] = 31;
        DaysInMonth[8] = 30;
        DaysInMonth[9] = 31;
        DaysInMonth[10] = 30;
        DaysInMonth[11] = 31;

        for (int i = 0; i < 12; i++){
            System.out.println(DaysInMonth[i]);
        }
/*
// Вывести массив, используя свойство длины массива.
        for (int i = 0; i < DaysInMonth.length; i++) {
            System.out.println(DaysInMonth[i]);
        }

//Вывести массив с помощью цикла for each.
        for (int i : DaysInMonth) {
            System.out.println(i);
        }
*/
    }
}
