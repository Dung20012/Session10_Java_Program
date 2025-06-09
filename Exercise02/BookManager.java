package homeword.Exercise02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookManager {
    private HashMap<String, Book> bookHashMap = new HashMap<>();

//    Thêm sách
    public void addBook(Scanner scanner){
        try {
            System.out.println("Nhập tên sách: ");
            String name = scanner.nextLine();
            System.out.println("Nhập tác giả: ");
            String author = scanner.nextLine();
            System.out.println("Nhập năm xuất bản: ");
            int year = Integer.parseInt(scanner.nextLine());

            Book book = new Book(name,author,year);
            bookHashMap.put(name, book);
            System.out.println("Sách đã đc thêm thành công");
        }catch (NumberFormatException e){
            System.out.println("Vui lòng k để trống !");
        }
    }
//    Tìm kiếm sách theo tên
    public void searchBook(Scanner scanner){
        System.out.println("Nhập tên sách cần tìm: ");
        String name = scanner.nextLine();

        if (bookHashMap.containsKey(name)){
            System.out.println("Tìm thấy sách: " + bookHashMap.get(name));
        }else {
            System.out.println("Không tìm thấy sách");
        }
    }
//    Hiển thị danh sách
    public void showAllBook(){
        if (bookHashMap.isEmpty()){
            System.out.println("Danh sách rỗng");
            return;
        }
        System.out.println("Danh sách sách: ");
        for (Map.Entry<String, Book>entry : bookHashMap.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
