package homeword.Exercise05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InvoiceManager manager = new InvoiceManager();  // Đảm bảo constructor khởi tạo danh sách
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("***** MENU QUẢN LÝ HÓA ĐƠN *****");
            System.out.println("1. Thêm hóa đơn");
            System.out.println("2. Sửa hóa đơn");
            System.out.println("3. Xóa hóa đơn");
            System.out.println("4. Hiển thị danh sách hóa đơn");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số hợp lệ!");
                continue;
            }

            switch (choice) {
                case 1:
                    // Thêm hóa đơn
                    int id = InputData.getInt(scanner, "Nhập ID hóa đơn: ");
                    String code = InputData.getString(scanner, "Nhập mã hóa đơn: ");
                    if (manager.exists(code)) {
                        System.out.println("Mã hóa đơn đã tồn tại!");
                        break;
                    }
                    double amount = InputData.getDouble(scanner, "Nhập số tiền: ");
                    manager.add(new Invoice(id, code, amount));
                    System.out.println("Thêm hóa đơn thành công!");
                    break;

                case 2:
                    // Sửa hóa đơn
                    manager.display();
                    String updateCode = InputData.getString(scanner, "Nhập mã hóa đơn cần sửa: ");
                    int updateIndex = manager.findIndexByCode(updateCode);
                    if (updateIndex == -1) {
                        System.out.println("Không tìm thấy hóa đơn!");
                    } else {
                        double newAmount = InputData.getDouble(scanner, "Nhập số tiền mới: ");
                        Invoice old = manager.getInvoices().get(updateIndex);
                        manager.update(updateIndex, new Invoice(old.getId(), updateCode, newAmount));
                        System.out.println("Sửa hóa đơn thành công!");
                    }
                    break;

                case 3:
                    // Xóa hóa đơn
                    manager.display();
                    int deleteId = InputData.getInt(scanner, "Nhập ID hóa đơn cần xóa: ");
                    int deleteIndex = manager.findIndexByCode(String.valueOf(deleteId));
                    if (deleteIndex == -1) {
                        System.out.println("Không tìm thấy hóa đơn nào có id = " + deleteId);
                    } else {
                        manager.delete(deleteIndex);
                        System.out.println("Hóa đơn được thành công!");
                    }
                    break;

                case 4:
                    // Hiển thị
                    manager.display();
                    break;

                case 5:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;

                default:
                    System.err.println("Lựa chọn không hợp lệ. Vui lòng thử lại!");
            }
        }
    }
}
