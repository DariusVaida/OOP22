package Lab04;

public class MatrixDivide {
    public void matrixDivideByConst(int[][] matrix1, int div , int row , int cols)
    {

        System.out.println();
        int[][] result = new int[row][cols];

        System.out.println("Divide = ");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                result[i][j] = matrix1[i][j] / div;

                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
