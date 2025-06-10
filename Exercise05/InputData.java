package homeword.Exercise05;

import java.util.Scanner;

public class InputData {

    public static String getString(Scanner scanner, String prompt){
        String input;
        do {
            System.out.println(prompt);
            input = scanner.nextLine();
            if (input.isEmpty()){
                System.out.println("Vui lòng không để trống!");
            }
        } while (input.isEmpty());
        return input;
    }

    public static double getDouble(Scanner scanner, String prompt){
        double value;
        while (true){
            try {
                System.out.println(prompt);
                value = Double.parseDouble(scanner.nextLine());
                if (value < 0){
                    System.out.println("Vui lòng nhập số thực >= 0!");
                } else {
                    return value;
                }
            } catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số thực hợp lệ!");
            }
        }
    }

    public static int getInt(Scanner scanner, String prompt) {
        int value;
        while (true) {
            try {
                System.out.println(prompt);
                value = Integer.parseInt(scanner.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên hợp lệ!");
            }
        }
    }
}
