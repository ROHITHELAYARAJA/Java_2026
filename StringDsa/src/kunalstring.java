import java.util.*;
public class kunalstring {
    public static void main(String[] args) {
        float x =123.7346f;
        System.out.printf("FLOAT %.3f",x);
        System.out.println();
        System.out.printf("MATH PI %.2f",Math.PI);
        System.out.println();
        System.out.printf("hi my name is %s and i am %s","rohith","good");
        System.out.println();


        String name = "Rohith";
        int age = 21;
        double cgpa = 8.45678;
        char grade = 'A';
        boolean placed = true;
        int number = 255;

        System.out.printf("String (%%s): %s%n", name);
        System.out.printf("Integer (%%d): %d%n", age);
        System.out.printf("Float (%%f): %f%n", cgpa);
        System.out.printf("Float 2 decimal (%%.2f): %.2f%n", cgpa);
        System.out.printf("Character (%%c): %c%n", grade);
        System.out.printf("Boolean (%%b): %b%n", placed);
        System.out.printf("Scientific (%%e): %e%n", cgpa);
        System.out.printf("Hexadecimal (%%x): %x%n", number);
        System.out.printf("Hexadecimal Upper (%%X): %X%n", number);
        System.out.printf("Octal (%%o): %o%n", number);
        System.out.printf("Width 5 (%%5d): %5d%n", age);
        System.out.printf("Left Align (%%-5d): %-5d%n", age);
        System.out.printf("Leading Zeros (%%05d): %05d%n", age);
        System.out.printf("Percentage (%%%%): 50%%%n");

        System.out.printf("%n--- Combined Example ---%n");
        System.out.printf("Name: %-10s Age: %02d CGPA: %.2f Grade: %c Placed: %b%n",
                name, age, cgpa, grade, placed);

    }
}
