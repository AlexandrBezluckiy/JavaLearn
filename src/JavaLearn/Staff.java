package JavaLearn;

public class Staff {
    String name;
    String position;
    double salary;

    public Staff(String name, String position,double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String info (int month) {
        double payment = salary * month;
        String info = "Name: " + name + "\nPosition: " + position + "\nSalary: " + salary + "\nPayment for " + month + "th month: " + payment + "\n";
        return info;
    }
}
