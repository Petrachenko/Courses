import java.util.Scanner;
import java.security.SecureRandom;

public class Program_3 {

    public static void main(String[] args) {
        final String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        final String digits = "0123456789";
        final String specialCharacters = "!@#№$;%^:&*()-_+=/'{}[]|.,`~?";
        final String allCharacters = upperCase + lowerCase + digits + specialCharacters;
        int length;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину пароля (от 8 до 12): ");
        length = scanner.nextInt();

        while(length < 8 || length > 12){
            System.out.print("Неверная длина.Введите длину пароля (от 8 до 12): ");
            length = scanner.nextInt();
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);

        password.append(upperCase.charAt(random.nextInt(upperCase.length())));
        password.append(lowerCase.charAt(random.nextInt(lowerCase.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(specialCharacters.charAt(random.nextInt(specialCharacters.length())));

        for(int i = 4; i < length; i++)
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));

        char[] passArray = password.toString().toCharArray();
        for(int i = passArray.length - 1; i > 0; i--){
            int randIndex = random.nextInt(i + 1);
            char temp = passArray[i];
            passArray[i] = passArray[randIndex];
            passArray[randIndex] = temp;
        }

        System.out.println("Созданный пароль: " + new String(passArray));
        scanner.close();
    }
}
