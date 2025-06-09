package homeword.Exercise02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookManager manager = new BookManager();
        int choice;

        do {
            System.out.println("*****MENU QUẢN LÝ SÁCH*****");
            System.out.println("1. Thêm sách");
            System.out.println("2. Tìm kiếm sách");
            System.out.println("3. Hiển thị danh sách sách");
            System.out.println("4. Thoát");
            System.out.println("Lựa chọn của bạn: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Nhập k hợp lệ. Vui lòng nhập số");
                choice = -1;
                continue;
            }
            switch (choice){
                case 1:
                    manager.addBook(scanner);
                    break;
                case 2:
                    manager.searchBook(scanner);
                    break;
                case 3:
                    manager.showAllBook();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }while (true);
    }
}
