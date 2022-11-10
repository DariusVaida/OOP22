package Lab04;

public class MatrixMulti {

    public void matrixMultiplication(int[][] matrix1 , int[][] matrix2 , int row , int cols)
    {

        System.out.println();
        System.out.println("Product = ");
        int[][] product = new int[row][cols];
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                for (int k = 0; k < cols; k++)
                {
                    product[i][j] +=  matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(product[i][j]+"\t");
            }

            System.out.println();
        }
    }
}
