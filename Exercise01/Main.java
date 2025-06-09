package homeword.Exercise01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
            String name = InputData.getString(scanner, "Nhập tên sinh viên");
            int age = InputData.getInt(scanner, "Nhập tuổi sinh viên");
            double gpa = InputData.getDouble(scanner, "Nhập điểm trung bình sinh viên");

            Student student = new Student(name,age,gpa);
            manager.addStudent(student);

            continueInput = InputData.getString(scanner, "Bạn có muốn thêm sinh viên khác? (y/n): ");
        }while (continueInput.equals("y"));

        System.out.println("\n Danh sách sinh viên: ");
        manager.displayStudent();

        scanner.close();
    }
}
