import java.util.Scanner;
public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projectionName = scanner.nextLine();
        String moviePacket = scanner.nextLine();
        int countTickets = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (projectionName){
            case "John Wick":
                if ("Drink".equals(moviePacket)){
                    price = 12;
                }
                else if ("Popcorn".equals(moviePacket)){
                    price = 15;
                }
                else if ("Menu".equals(moviePacket)){
                    price = 19;
                }
                break;
            case "Star Wars":
                if ("Drink".equals(moviePacket)){
                    price = 18;
                }
                else if ("Popcorn".equals(moviePacket)){
                    price = 25;
                }
                else if ("Menu".equals(moviePacket)){
                    price = 30;
                }
                break;
            case "Jumanji":
                if ("Drink".equals(moviePacket)){
                    price = 9;
                }
                else if ("Popcorn".equals(moviePacket)){
                    price = 11;
                }
                else if ("Menu".equals(moviePacket)){
                    price = 14;
                }
                break;
        }
        double totalSum = price * countTickets;
            if ("Star Wars".equals(projectionName) && countTickets >= 4){
                totalSum *= 0.70;
            }
            if ("Jumanji".equals(projectionName) && countTickets == 2){
                totalSum *= 0.85;
            }
        System.out.printf("Your bill is %.2f leva.",totalSum);
    }
}