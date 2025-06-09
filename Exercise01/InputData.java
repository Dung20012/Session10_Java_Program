package homeword.Exercise01;

import java.util.Scanner;

public class InputData {
    public static String getString(Scanner scanner, String string){
        String input = "";
        do {
            System.out.println(string);
            input = scanner.nextLine();
            if (input.isEmpty()){
                System.out.println("Vui lòng không để trống");
            }
        }while (input.isEmpty());
        return input;
    }
    public static int getInt(Scanner scanner, String string){
        String rs = "";

        do {
            System.out.println(string);
            rs = scanner.nextLine();
            try {
                if (rs.isEmpty()){
                    System.out.println("Vui lòng không bỏ trống");
                } else if (Integer.parseInt(rs) < 0){
                    System.out.println("Vui lòng nhập số nguyên >=0");
                }else {
                    break;
                }
            }catch (Exception e){
                System.out.println("Vui lòng nhập số nguyên >=0");
            }
        }while (true);
        return Integer.parseInt(rs);
    }

    public static double getDouble(Scanner scanner, String string){
        String rs = "";
        do {
            System.out.println(rs);
            rs = scanner.nextLine();
            try {
                if (rs.isEmpty()){
                    System.out.println("Vui lòng k bỏ trống");
                } else if (Double.parseDouble(rs) < 0) {
                    System.out.println("Vui lòng nhập số thực >=0");
                }else {
                    break;
                }
            }catch (Exception e){
                System.out.println("Vui lòng nhập số thực >=0");
            }
        }while (true);
            return Double.parseDouble(rs);
    }
}
