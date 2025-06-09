package homeword.Exercise02;

public class Book {
    private String name;
    private String author;
    private int year;

//    Constructor tham số
    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Tên sách: " + name + "," + " Tác giả: " + author + "," + " Năm xuất bản: " + year;
    }
}
