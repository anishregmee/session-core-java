package day16;

import java.time.LocalDate;

public class OfficeApplication {

    public static void main(String[] args) {
        Employee ram = new Employee("ram", LocalDate.now(),1000);

        Manager anish = new Manager("anish", LocalDate.now(), 5000, 2000);

        Cleaner regmee = new Cleaner("regmee", LocalDate.now(), 1000,0);

        regmee.fireEmploye();

        someFunction(anish);

        System.out.println(ram.getSalary());
        System.out.println(anish.getSalary());

        System.out.println(ram.getDescription());
        System.out.println(anish.getDescription());
    }
    public static void someFunction(Person person){
        if(person instanceof Manager){
            ((Manager)person).fireEmploye();
        }


    }
}
