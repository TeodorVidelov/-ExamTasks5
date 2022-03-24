import java.util.Scanner;
public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int countOfJury = Integer.parseInt(scanner.nextLine());

        double sumPoints = pointsFromAcademy;

        for (int i = 0; i < countOfJury; i++) {
            String nameOfJury = scanner.nextLine();
            double pointsFromJury = Double.parseDouble(scanner.nextLine());

            int actorLength = nameOfJury.length();
            double juryPoints = (actorLength * pointsFromJury) / 2;
            sumPoints += juryPoints;

            if (sumPoints > 1250.5){
                break;
            }
        }
        if (sumPoints > 1250.50){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName,sumPoints);
        }
        else {
            System.out.printf("Sorry, %s you need %.1f more!",actorName,1250.50 - sumPoints);
        }
    }
}