package day14;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySorting {
    public static void main(String[] args) {
        String[] names = {"zello","world"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        Student[] students = new Student[2];
        students[0] = new Student("anish","32");
        students[1] = new Student("regmeee","31");
//
//        Arrays.sort(students, Comparator.comparing(student -> {
//            return student.getAge() - student.getAge()
//        }));
//
//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o2.getAge() - o1.getAge();
//            }
//        });
        System.out.println(Arrays.toString(students));


    }
}
