package homeword.Exercise03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManager manager = new UserManager();
        int choice;

        do {
            System.out.println("*****MENU QUẢN LÝ NGƯỜI DÙNG*****");
            System.out.println("1. Thêm người dùng");
            System.out.println("2. Xóa người dùng");
            System.out.println("3. Hiển thị danh sách người dùng");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
                choice = -1;
                continue;
            }

            switch (choice) {
                case 1:
                    manager.addUser(scanner);
                    break;
                case 2:
                    manager.deleteUser(scanner);
                    break;
                case 3:
                    manager.showUsers();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ.");
            }
        } while (true);
    }
}
