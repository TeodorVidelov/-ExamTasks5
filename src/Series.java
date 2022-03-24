import java.util.Scanner;
public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countSerials = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countSerials; i++) {
            String serialName = scanner.nextLine();
            double serialPrice = Double.parseDouble(scanner.nextLine());
            if ("Thrones".equals(serialName)){
                budget -= serialPrice * 0.50;
            }
            else if ("Lucifer".equals(serialName)){
                budget -= serialPrice * 0.60;
            }
            else if ("Protector".equals(serialName)) {
                budget -= serialPrice * 0.70;
            }
            else if ("TotalDrama".equals(serialName)){
                budget -= serialPrice * 0.80;
            }
            else if ("Area".equals(serialName)){
                budget -= serialPrice * 0.90;
            }
            else {
                budget -= serialPrice;
            }
        }
        if (budget >= 0){
            System.out.printf("You bought all the series and left with %.2f lv.",budget);
        }
        else {
            System.out.printf("You need %.2f lv. more to buy the series!",Math.abs(budget));
        }
    }
}