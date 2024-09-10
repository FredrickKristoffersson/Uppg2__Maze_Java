public class Player extends Item implements InputMovement {
    private String name;
    private int health;
    private Maze maze;

    public Player(String name,int x, int y,int health, Maze maze) {
        super(x,y);
        this.name = name;
        this.health = health;
        this.maze = maze;
    }
    @Override
    public void moveUp() {
        if (!maze.isWall(x, y - 1)) {
            y--;
            if (maze.isFinish(x, y)) {
                System.out.println("Grattis! Du har klarat labyrinten!");
                System.exit(0);
            }

        }
    }

    @Override
    public void moveDown() {
        if (!maze.isWall(x, y + 1)) {
            y++;
            if (maze.isFinish(x, y)) {
                System.out.println("Grattis! Du har klarat labyrinten!");
                System.exit(0);  // Avsluta programmet
            }

        }
    }

    @Override
    public void moveLeft() {
        if (!maze.isWall(x - 1, y)) {
            x--;
            if (maze.isFinish(x, y)) {
                System.out.println("Grattis! Du har klarat labyrinten!");
                System.exit(0);  // Avsluta programmet
            }

        }
    }

    @Override
    public void moveRight() {
        if (!maze.isWall(x + 1, y)) {
            x++;
            if (maze.isFinish(x, y)) {
                System.out.println("Grattis! Du har klarat labyrinten!");
                System.exit(0);  // Avsluta programmet
            }

        }
    }
}
