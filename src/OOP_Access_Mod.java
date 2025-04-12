import JavaLearn.Man;

public class OOP_Access_Mod {
    public static void main(String[] args) {
        Man man = new Man("Ivan", 23);
        man.set_age(-40);
        System.out.println(man.get_age());
        System.out.println(man.get_name());
//        man.show_info();
    }
}
