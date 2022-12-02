package day3;

public class SchoolApp {

    public static void main(String[] args) {
        Student anish = new Student();
        anish.setAge("23");
        anish.setName("Anish");

        Teacher ramesh = new Teacher();
        ramesh.setAge("37");
        ramesh.setName("ramesh");

        System.out.println(ramesh.getName());
    }
}
