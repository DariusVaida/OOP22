package Lab04;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args)
    {
        MatrixAddition addMatrix = new MatrixAddition();
        MatrixCreate createMatrix = new MatrixCreate();
        MatrixSubstract subMatrix = new MatrixSubstract();
        MatrixMulti multiMatrix = new MatrixMulti();
        MatrixDivide divideMatrix = new MatrixDivide();
        int[][] matrix1 = createMatrix.matrixCreation();
        int[][] matrix2 = createMatrix.matrixCreation();
        addMatrix.matrixAdd(matrix1, matrix2, 2 , 2);
        subMatrix.matrixSubstraction(matrix1, matrix2 , 2, 2);
        multiMatrix.matrixMultiplication(matrix1 , matrix2 , 2,2);
        divideMatrix.matrixDivideByConst(matrix1 , 2 , 2 ,2);
    }
}