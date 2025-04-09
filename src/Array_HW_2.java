public class Array_HW_2 {
    public static void main(String[] args) {
        String out= "";
        String[] st = {"Янв","Фев","Мар","Апр","Май","Июн","Июл","Авг","Сен","Окт","Ноя","Дек"};
        for (int i = 0; i < st.length; i++) {
            if (i != st.length - 1) {
                out += st[i] + ", ";
            }
            else {
                out += st[i] + ".";
            }
        }
        System.out.println(out);
    }
}
