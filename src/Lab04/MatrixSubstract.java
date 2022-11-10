package Lab04;

public class MatrixSubstract {
    public void matrixSubstraction(int[][] matrix1, int[][] matrix2 , int row , int cols)
    {
        int[][] diff = new int[row][cols];
        System.out.println();

        System.out.println("Substract = ");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                diff[i][j] = matrix1[i][j] - matrix2[i][j];

                System.out.print(diff[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
