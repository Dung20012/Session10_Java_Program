package homeword.Exercise01;

public class Student {
    private String name;
    private int age;
    private double gpa;

//    Constructor k tham số
    public Student() {
    }
    //    Constructor có tham số
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", " + " Tuổi: " + age + "," + " Điểm TB: " + gpa;
    }
}
