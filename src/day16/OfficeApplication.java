package day16;

import java.time.LocalDate;

public class OfficeApplication {

    public static void main(String[] args) {
        Employee ram = new Employee("ram", LocalDate.now(),1000);

        Manger anish = new Manger("anish", LocalDate.now(), 5000, 2000);

        System.out.println(ram.getSalary());
        System.out.println(anish.getSalary());

        System.out.println(ram.getDescription());
        System.out.println(anish.getDescription());
    }
}
