import java.util.Scanner;
public class MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String filmingDestination = scanner.nextLine();
        String season = scanner.nextLine();
        int countDays = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if ("Winter".equals(season)){
            if ("Dubai".equals(filmingDestination)){
                price = 45000;
            }
            else if ("Sofia".equals(filmingDestination)){
                price = 17000;
            }
            else if ("London".equals(filmingDestination)){
                price = 24000;
            }
        }
        else if ("Summer".equals(season)){
            if ("Dubai".equals(filmingDestination)){
                price = 40000;
            }
            else if ("Sofia".equals(filmingDestination)){
                price = 12500;
            }
            else if ("London".equals(filmingDestination)){
                price = 20250;
            }
        }
        double totalSum = price * countDays;

        if ("Dubai".equals(filmingDestination)){
            totalSum *= 0.70;
        }
        else if ("Sofia".equals(filmingDestination)){
            totalSum *= 1.25;
        }
        double diff = Math.abs(totalSum - budget);
        if (budget >= totalSum){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!",diff);
        }
        else {
            System.out.printf("The director needs %.2f leva more!",diff);
        }
    }
}