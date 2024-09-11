import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Maze maze = new Maze();
        Player user = new Player("Namn", 1, 1, 1, maze);
        Monster demon = new Monster(7,6, maze);

        maze.displayMaze(user, demon);
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
            demon.moveRandom();
            if (maze.isBitByMonster(user.getX(), user.getY(), demon.getX(), demon.getY())) {
                System.out.println("Demonen tog dig!");
                break;
            }

            maze.displayMaze(user, demon);
            System.out.print("Använd A,S,D eller W för att styra spelare(P). ");
            System.out.println("E avslutar spelet");
        }
    }
}
