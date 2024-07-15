import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student's name:");
        String name = scanner.nextLine();

        System.out.println("Enter scores for five subjects:");
        System.out.print("Math: ");
        int mathScore = scanner.nextInt();
        System.out.print("Science: ");
        int scienceScore = scanner.nextInt();
        System.out.print("English: ");
        int englishScore = scanner.nextInt();
        System.out.print("History: ");
        int historyScore = scanner.nextInt();
        System.out.print("Computer Science: ");
        int csScore = scanner.nextInt();

        int totalScore = mathScore + scienceScore + englishScore + historyScore + csScore;
        double averageScore = (double) totalScore / 5;

        String grade;
        if (averageScore >= 90) {
            grade = "A";
        } else if (averageScore >= 80) {
            grade = "B";
        } else if (averageScore >= 70) {
            grade = "C";
        } else if (averageScore >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Student's Name: " + name);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Percentage: " + averageScore);
        System.out.println("Grade: " + grade);
    }
}