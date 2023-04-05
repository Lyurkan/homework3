import java.util.Scanner;
public class HomeWork3 {
    public static void main(String[] args) {
        String[] questions = {"Сколько ног у собаки?\nВарианты ответов:\n1. Две ноги\n2. Три ноги\n3. Четыре ноги",
                "В каком году началась вторая мировая война?\n1.1930\n2.1935\n3.1939\n4.1941",
                "Кто основатель компании Microsoft?\n1. Гейтс\n2. Пакард\n3. Джобс\n4. Возняк\n5. Холлерит"};
        int[] correctAnswers = {3, 3, 1};
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