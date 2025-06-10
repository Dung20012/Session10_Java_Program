package homeword.Exercise06;

import java.util.Scanner;

public class InputData {
    public static String getString(Scanner scanner, String prompt){
        String input;
        do {
            System.out.println(prompt);
            input = scanner.nextLine().trim();
            if (input.isEmpty()){
                System.out.println("K được để trống");
            }
        }while (input.isEmpty());
        return input;
    }
}
