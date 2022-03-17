import java.util.Scanner;
public class MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int countDays = Integer.parseInt(scanner.nextLine());
        int countTickets = Integer.parseInt(scanner.nextLine());
        double priceOfTicket = Double.parseDouble(scanner.nextLine());
        int percentForCinema = Integer.parseInt(scanner.nextLine());

        double sumPrice = countTickets * priceOfTicket;
        double sumForPeriod = sumPrice * countDays;
        double sumPercentForCinema = sumForPeriod * (percentForCinema * 1.0 / 100);

        System.out.printf("The profit from the movie The Programmer is %.2f lv.",sumForPeriod - sumPercentForCinema);
    }
}