package day14;

public class Student implements Comparable<Student>{
    public String name, age;

    public Student(String anish, String s) {
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
//        return this.age.compareTo(o.age); sort on the basis of age
//        return this.age - o.age;

//        return o.name.compareTo(this.name) yasari chai descending value aauchha
    }
}
