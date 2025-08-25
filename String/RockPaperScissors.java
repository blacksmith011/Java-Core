import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        return choice == 0 ? "rock" : choice == 1 ? "paper" : "scissors";
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) return "user";
        return "computer";
    }

    public static String[][] calculateStats(String[][] results, int totalGames) {
        int userWins = 0, computerWins = 0;
        for (String[] result : results) {
            if (result[2].equals("user")) userWins++;
            else if (result[2].equals("computer")) computerWins++;
        }
        String[][] stats = new String[2][2];
        stats[0][0] = "User Win %";
        stats[0][1] = String.valueOf((userWins * 100) / totalGames);
        stats[1][0] = "Computer Win %";
        stats[1][1] = String.valueOf((computerWins * 100) / totalGames);
        return stats;
    }

    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("User\tComputer\tWinner");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
        System.out.println("\nStatistics:");
        for (String[] stat : stats) {
            System.out.println(stat[0] + ": " + stat[1] + "%");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        String[][] results = new String[n][3];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String computer = getComputerChoice();
            String winner = findWinner(user, computer);
            results[i][0] = user;
            results[i][1] = computer;
            results[i][2] = winner;
        }
        String[][] stats = calculateStats(results, n);
        displayResults(results, stats);
    }
}
