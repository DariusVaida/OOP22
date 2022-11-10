package Lab04;

public class MatrixAddition {

    public void matrixAdd(int[][] matrix1, int[][] matrix2 , int row , int cols)
    {

        System.out.println();
        int[][] sum = new int[row][cols];

        System.out.println("Sum = ");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];

                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
