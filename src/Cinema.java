import java.util.Scanner;
public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacityOfHall = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int ticketPrice = 5;
        int sumSoldTickets = 0;
        int totalVisitors = 0;
        while (!"Movie time!".equals(input)){
            int countVisitors = Integer.parseInt(input);
            capacityOfHall -= countVisitors;

            if (capacityOfHall < 0) {
                System.out.println("The cinema is full.");
                break;
            }
            if (countVisitors % 3 == 0){
                sumSoldTickets += countVisitors * ticketPrice - 5;
            }
            else {
                sumSoldTickets += countVisitors * 5;
            }
            input = scanner.nextLine();
        }
        if ("Movie time!".equals(input)){
            System.out.printf("There are %d seats left in the cinema.\n",capacityOfHall);
        }
        System.out.printf("Cinema income - %d lv.",sumSoldTickets);
    }
}