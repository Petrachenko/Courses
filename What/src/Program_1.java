import java.util.Scanner;
import java.util.Random;

public class Program_1 {

    public static void main(String[] args) {
        boolean isGues = false;
        final int maxLives = 6;
        int lives = maxLives;
        final String[] Words = {"Java", "Python", "Ruby"};

        Random random = new Random();
        String Word = Words[random.nextInt(Words.length)];

        char[] guesWord = new char[Word.length()];
        for(int i = 0; i < guesWord.length; i++)
            guesWord[i] = '_';

        Scanner scanner = new Scanner(System.in);

        while (lives > 0 && !isGues){
            System.out.println("Загаданное слово: " + String.valueOf(guesWord));
            System.out.println("Количество жизней: " + lives);
            System.out.print("Ввод буквы: ");
            char guess = scanner.nextLine().charAt(0);

            boolean isCorrect = false;

            for (int i = 0; i < Word.length(); i++) {
                if (Word.charAt(i) == guess) {
                    guesWord[i] = guess;
                    isCorrect = true;
                }
            }

            if (!isCorrect) {
                lives--;
            }

            isGues = true;
            for (char c : guesWord) {
                if (c == '_') {
                    isGues = false;
                    break;
                }
            }

            if (isGues) {
                System.out.println("Вы угадали слово: " + Word);
            }
        }

        if (!isGues) {
            System.out.println("Игра окончена. Загаданное слово: " + Word);
        }
        scanner.close();
    }
}
