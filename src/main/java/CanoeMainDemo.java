import java.util.Scanner;

public class CanoeMainDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println( "    W E L C O M E   T O     ");
        System.out.println( "  ___ __ _ _ __   ___   ___ \n" +
                " / __/ _` | '_ \\ / _ \\ / _ \\\n" +
                "| (_| (_| | | | | (_) |  __/\n" +
                " \\___\\__,_|_| |_|\\___/ \\___|");

        do {
            System.out.println("Please select an option from below:");
            System.out.println("1) Book Trip\n 2) View Booked Trips\n 3) Exit");

            String menuOption = scanner.nextLine();
            switch (menuOption) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    running = false;
                    break;
                default:
                    System.out.println("'wwwwOOOOOOwwwww, not a valid option, mannnnn!' -Owen Wilson");
                    break;
            }

        }while(running);

    }
}
