import java.util.ArrayList;

public class Maze {
    // Better with Char instead of String here?
    // Creating an arraylist with arraylists inside it
    ArrayList<ArrayList<String>> maze;

    public Maze() {
        maze = new ArrayList<>();

        maze.add(new ArrayList<>());
        maze.get(0).add("0");
        maze.get(0).add("0");
        maze.get(0).add("0");
        maze.get(0).add("0");
        maze.get(0).add("0");
        maze.get(0).add("0");
        maze.get(0).add("0");
        maze.get(0).add("0");
        maze.get(0).add("0");

        maze.add(new ArrayList<>());
        maze.get(1).add("0");
        maze.get(1).add(".");
        maze.get(1).add(".");
        maze.get(1).add("0");
        maze.get(1).add(".");
        maze.get(1).add(".");
        maze.get(1).add(".");
        maze.get(1).add(".");
        maze.get(1).add("F");

        maze.add(new ArrayList<>());
        maze.get(2).add("0");
        maze.get(2).add(".");
        maze.get(2).add(".");
        maze.get(2).add("0");
        maze.get(2).add(".");
        maze.get(2).add(".");
        maze.get(2).add("0");
        maze.get(2).add("0");
        maze.get(2).add("0");

        maze.add(new ArrayList<>());
        maze.get(3).add("0");
        maze.get(3).add(".");
        maze.get(3).add(".");
        maze.get(3).add("0");
        maze.get(3).add(".");
        maze.get(3).add(".");
        maze.get(3).add(".");
        maze.get(3).add(".");
        maze.get(3).add("0");

        maze.add(new ArrayList<>());
        maze.get(4).add("0");
        maze.get(4).add(".");
        maze.get(4).add(".");
        maze.get(4).add("0");
        maze.get(4).add(".");
        maze.get(4).add(".");
        maze.get(4).add("0");
        maze.get(4).add(".");
        maze.get(4).add("0");

        maze.add(new ArrayList<>());
        maze.get(5).add("0");
        maze.get(5).add(".");
        maze.get(5).add(".");
        maze.get(5).add(".");
        maze.get(5).add(".");
        maze.get(5).add("0");
        maze.get(5).add("0");
        maze.get(5).add(".");
        maze.get(5).add("0");

        maze.add(new ArrayList<>());
        maze.get(6).add("0");
        maze.get(6).add(".");
        maze.get(6).add(".");
        maze.get(6).add(".");
        maze.get(6).add(".");
        maze.get(6).add("0");
        maze.get(6).add(".");
        maze.get(6).add(".");
        maze.get(6).add("0");

        maze.add(new ArrayList<>());
        maze.get(7).add("0");
        maze.get(7).add("0");
        maze.get(7).add("0");
        maze.get(7).add("0");
        maze.get(7).add("0");
        maze.get(7).add("0");
        maze.get(7).add("0");
        maze.get(7).add("0");
        maze.get(7).add("0");
    }

    // Checks if we have a wall (String 0) in our way
    public boolean isWall(int x, int y) {
        if (x < 0 || y < 0 || y >= maze.size() || x >= maze.get(y).size()) {
            return true;
        }
        return maze.get(y).get(x).equals("0");
    }

    // Check if we have gotten to our goal
    public boolean isFinish(int x, int y) {
        if (x < 0 || y < 0 || y >= maze.size() || x >= maze.get(y).size()) {
            return false;  // Utanför labyrinten kan inte vara målet
        }
        return maze.get(y).get(x).equals("F");
    }

    public void displayMaze(Player player) {
        for (int i = 0; i < maze.size(); i++) {
            for (int j = 0; j < maze.get(i).size(); j++) {
                if (i == player.getY() && j == player.getX()) {
                    System.out.print('P' + " ");
                } else {
                    System.out.print(maze.get(i).get(j) + " ");
                }
            }
            System.out.println();
        }
    }
}
