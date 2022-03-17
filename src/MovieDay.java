import java.util.Scanner;
public class MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filmingTime = Integer.parseInt(scanner.nextLine());
        int countScenes = Integer.parseInt(scanner.nextLine());
        int sceneDuration = Integer.parseInt(scanner.nextLine());

        double preparationTime = filmingTime * 0.15;
        double timeForFilming = countScenes * sceneDuration;
        double neededTime = preparationTime + timeForFilming;
        double diff = Math.abs(filmingTime - neededTime);
        if (filmingTime >= neededTime){
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!",diff);
        }
        else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.",diff);
        }
    }
}