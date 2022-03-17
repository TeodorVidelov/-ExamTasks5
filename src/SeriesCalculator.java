import java.util.Scanner;
public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serialName = scanner.nextLine();
        int countSeasons = Integer.parseInt(scanner.nextLine());
        int countEpisodes = Integer.parseInt(scanner.nextLine());
        double lengthOfEpisodeWithoutAds = Double.parseDouble(scanner.nextLine());

        double lengthOfAds = lengthOfEpisodeWithoutAds * 0.2;
        double lengthOfEpisodeWithAds = lengthOfEpisodeWithoutAds + lengthOfAds;
        double lengthOfSpecialEpisodes = countSeasons * 10;
        double totalTime = lengthOfEpisodeWithAds * countEpisodes * countSeasons + lengthOfSpecialEpisodes;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",serialName,totalTime);
    }
}