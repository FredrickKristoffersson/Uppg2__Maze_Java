import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Maze maze = new Maze();
        Player user = new Player("Namn", 1, 1, 1, maze);

        maze.displayMaze(user);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Använd A,S,D eller W för att styra spelare(P)");

        while (true) {
            String input = scanner.nextLine();
            switch (input) {
                case "a", "A": user.moveLeft();
                break;
                case "s", "S": user.moveDown();
                break;
                case "d", "D": user.moveRight();
                break;
                case "w", "W": user.moveUp();
                break;
                case "e", "E":
                    System.out.println("Spel avslutas");
                    return;
                default:
                    System.out.println("Fel val, försök igen");
                    break;
            }
            maze.displayMaze(user);
            System.out.print("Använd A,S,D eller W för att styra spelare(P). ");
            System.out.println("E avslutar spelet");
        }
    }
}
