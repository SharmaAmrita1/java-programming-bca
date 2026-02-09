// WAP to print a matrix
//Algorithm:
//1.Take input from the user for number of rows and columns.
//2.Create a 2D array of size rows x columns.   
//3.Take input from the user for the elements of the matrix.
//4.Print the matrix in a formatted way.
import java.util.Scanner;
class PrintMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}