import java.util.Scanner;
public class MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetForActors = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        while (!"ACTION".equals(input)){
            String actorName = input;
            int lengthName = actorName.length();
            if (lengthName <= 15){
                double salary = Double.parseDouble(scanner.nextLine());
                budgetForActors -= salary;
            }
            else {
                budgetForActors -= budgetForActors * 0.20;
            }
            if (budgetForActors < 0){
                break;
            }
            input = scanner.nextLine();
        }
        if (budgetForActors >= 0){
            System.out.printf("We are left with %.2f leva.",budgetForActors);
        }
        else {
            System.out.printf("We need %.2f leva for our actors.",Math.abs(budgetForActors));
        }
    }
}