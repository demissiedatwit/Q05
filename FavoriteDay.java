import java.util.Scanner;

public class FavoriteDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your favorite day of the week?");
        String favoriteDay = scanner.nextLine();
        System.out.println("Your favorite day is " + favoriteDay);
    }
}
