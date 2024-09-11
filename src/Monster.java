    import java.util.Random;

    public class Monster extends Item implements InputMovement {
        private Maze maze;
        private Random random;

        public Monster(int x, int y, Maze maze) {
            super(x, y);
            this.maze = maze;
            this.random = new Random();
        }

        @Override
        public void moveUp() {
            if (!maze.isWall(x, y - 1)) {
                y--;
            }
        }

        @Override
        public void moveDown() {
            if (!maze.isWall(x, y + 1)) {
                y++;
            }
        }

        @Override
        public void moveLeft() {
            if (!maze.isWall(x - 1, y)) {
                x--;
            }
        }

        @Override
        public void moveRight() {
            if (!maze.isWall(x + 1, y)) {
                x++;
            }
        }

        // Method to make Monster move randomly
        public void moveRandom() {
            int direction = random.nextInt(4);

            switch (direction) {
                case 0 -> moveUp();
                case 1 -> moveDown();
                case 2 -> moveLeft();
                case 3 -> moveRight();
            }
        }

}
