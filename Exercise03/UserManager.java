package homeword.Exercise03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserManager {
    private HashMap<String,User> userHashMap = new HashMap<>();
//    Thêm người dùng
    public void addUser(Scanner scanner){
        try {
            String name;
            do {
                System.out.print("Nhập tên người dùng: ");
                name = scanner.nextLine().trim();
                if (name.isEmpty()) {
                    System.out.println("Vui lòng không được để trống !");
                }
            } while (name.isEmpty());

            String email;
            do {

                System.out.print("Nhập email người dùng: ");
                email = scanner.nextLine().trim();
                if (email.isEmpty()){
                    System.out.println("Vui lòng không được để trống !");
                }
            }while (email.isEmpty());

            String phone;
            do {
                System.out.print("Nhập số điện thoại người dùng: ");
                phone = scanner.nextLine().trim();
                if (phone.isEmpty()){
                    System.out.println("Vui lòng không được để trống !");
                }
            }while (phone.isEmpty());



            User user = new User(name, email, phone);
            userHashMap.put(email, user);
            System.out.println("Thêm người dùng thành công!");
        } catch (Exception e) {
            System.out.println("Lỗi nhập liệu: " + e.getMessage());
        }
    }
//    Xóa người dùng theo email
public void deleteUser(Scanner sc) {
    System.out.print("Nhập email người dùng cần xóa: ");
    String email = sc.nextLine();

    if (userHashMap.containsKey(email)) {
        userHashMap.remove(email);
        System.out.println("Người dùng đã được xóa thành công");
    } else {
        System.out.println("Không tìm thấy người dùng với email này.");
    }
    }
//    Hiển thị danh sách người dùng
public void showUsers() {
    if (userHashMap.isEmpty()) {
        System.out.println("Danh sách người dùng rỗng.");
        return;
    }

    System.out.println("Danh sách người dùng:");
    for (Map.Entry<String, User> entry : userHashMap.entrySet()) {
        System.out.println(entry.getValue());
    }
}
}
