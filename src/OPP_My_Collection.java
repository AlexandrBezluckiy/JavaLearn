import JavaLearn.Persons;

public class OPP_My_Collection {
    public static void main(String[] args) {
        String[] staff = {"Таня", "Ваня","Коля","Женя","Вася","Маня","Полина"};

        System.out.println(staff.length);

        staff = Persons.add_staff(staff, "Жанин");
        for (String s : staff) {
            System.out.println(s);
        }
        System.out.println(staff.length);

        System.out.println("Вася выходит из чата.");

        staff = Persons.remove_staff(staff, "Жанин");
        for (String s : staff) {
            System.out.println(s);
        }

        System.out.println(staff.length);
    }
}
