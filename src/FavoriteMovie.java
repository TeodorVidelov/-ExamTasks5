import java.util.Scanner;
public class FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  input = scanner.nextLine();

        int countMovies = 0;

        int maxPoints = Integer.MIN_VALUE;
        String bestMovie = "";
        while (!"STOP".equals(input)){
            String movieName = input;
            int sum = 0;
            countMovies++;
            for (int i = 0; i < movieName.length(); i++) {

                char sumSymbols = movieName.charAt(i);
                sum += sumSymbols;

                if (sumSymbols >= 65 && sumSymbols <= 90){
                    sum -= movieName.length();
                }
                else if (sumSymbols >= 97 && sumSymbols <= 122){
                    sum -= movieName.length() * 2;
                }
            }
            if (sum > maxPoints){
                maxPoints = sum;
                bestMovie = movieName;
            }
            if (countMovies == 7){
                System.out.println("The limit is reached.");
                break;
            }
            input = scanner.nextLine();
        }
           System.out.printf("The best movie for you is %s with %d ASCII sum.",bestMovie,maxPoints);
    }
}