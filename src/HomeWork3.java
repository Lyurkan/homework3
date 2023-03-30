import java.util.Scanner;
public class HomeWork3 {
    public static void main(String[] args) {
        String[] questions = {"Сколько будет 2/2?", "Сколько будет 2*1?", "Сколько будет 2+1?"};
        int[] correctAnswers = {1, 2, 3};
        int[] userAnswers = new int[correctAnswers.length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            userAnswers[i] = scanner.nextInt();
        }

        int rightAnswers = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i] == userAnswers[i]) {
                rightAnswers++;
            }
        }
        System.out.println("Количество правильных ответов: " + rightAnswers + " из " + correctAnswers.length);
    }
}