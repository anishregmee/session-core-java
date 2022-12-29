package day10;

import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter student\'s name");
        String studentName = scanner.nextLine();

        System.out.println("enter marks obtained in maths");
        int markMaths = scanner.nextInt();

        System.out.println("enter marks obtained in physics");
        int  markPhysics= scanner.nextInt();

        System.out.println("enter marks obtained in computer");
        int markComputer = scanner.nextInt();

        System.out.println("enter marks obtained in material");
        int markMaterial = scanner.nextInt();

        System.out.println("enter marks obtained in drawing");
        int markDrawing = scanner.nextInt();

        float grandTotal = (markMaths + markPhysics + markMaterial + markComputer + markDrawing);

        float percentage = (grandTotal/500) * 100;

        String formattedPercentage = String.format("%.2f", percentage);

        String message = String.format("congratulation, %s has obtained %s percentage", studentName, formattedPercentage);

        System.out.println(message);
    }
}
