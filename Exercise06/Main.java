package homeword.Exercise06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderManager manager = new OrderManager();
        int choice;

        while (true){
            System.out.println("***** MENU QUẢN LÝ ĐƠN HÀNG *****");
            System.out.println("1. Thêm đơn hàng");
            System.out.println("2. Sửa đơn hàng");
            System.out.println("3. Xóa đơn hàng");
            System.out.println("4. Hiển thị danh sách đơn hàng");
            System.out.println("5. Thoát");
            System.out.println("Lựa chọn của bạn: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số hợp lệ !");
                continue;
            }

            switch (choice){
                case 1:
                    String code = InputData.getString(scanner, "Nhập mã đơn hàng: ");
                    if (manager.exists(code)){
                        System.out.println("Mã đơn hàng đã tồn tại");
                        break;
                    }
                    String customer = InputData.getString(scanner, "Nhập tên khách hàng: ");
                    manager.add(new Order(code, customer));
                    break;
                case 2:
                    manager.display();
                    String updateCode = InputData.getString(scanner, "Nhập mã đơn hàng cần sửa: ");
                    int updateIndex = manager.findIndexByCode(updateCode);
                    if (updateIndex == -1){
                        System.out.println("K tìm thấy mã đơn hàng");
                    }else {
                        String newName = InputData.getString(scanner, "Nhập tên khách hàng mới: ");
                        manager.update(updateIndex, new Order(updateCode,newName));
                        System.out.println("Cập nhật thành công");
                    }
                    break;
                case 3:
                    manager.display();
                    String deleteCode = InputData.getString(scanner, "Nhập mã đơn hàng cần xóa: ");
                    int deleteIndex = manager.findIndexByCode(deleteCode);
                    if (deleteIndex == -1){
                        System.out.println("K tìm thấy mã đơn hàng cần xóa");
                    }else {
                        manager.delete(deleteIndex);
                        System.out.println("Xóa thành công");
                    }
                    break;
                case 4:
                    manager.display();
                    break;
                case 5:
                    System.out.println("Thoát");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn k hợp lệ");
            }
        }
    }
}
