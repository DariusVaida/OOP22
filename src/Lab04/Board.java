package Lab04;

public class Board {
    public Spot[][] boxes;

    public Board()
    {
        this.resetBoard();
    }

    public Spot getBox(int x, int y)
    {

        if (x < 0 || x > 7 || y < 0 || y > 7) {
            try {
                throw new Exception("Index out of bound");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return boxes[x][y];
    }

    public void resetBoard()
    {
        boxes[0][0] = new Spot(1, 0, new Pawn(true));
        //pawn class still doesn't work, will try to fix next week
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                boxes[i][j] = new Spot(i, j, null);
            }
        }
    }
}
