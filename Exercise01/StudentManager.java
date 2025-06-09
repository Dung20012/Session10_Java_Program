package homeword.Exercise01;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public StudentManager(){
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }
    public void displayStudent(){
        if (students.isEmpty()){ // ktra xem danh sách list rỗng hay k
            System.out.println("Chưa có sinh viên nào trong danh sách");
        }else {
            for (Student student : students){
                System.out.println(student);
            }
        }
    }
}
