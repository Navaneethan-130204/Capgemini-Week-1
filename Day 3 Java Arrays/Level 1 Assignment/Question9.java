import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the row: ");
        int row = input.nextInt();
        System.out.print("Enter the size of the col: ");
        int col = input.nextInt();
        int[][] arr2D = new int[row][col];
        int[] arr1D = new int[row * col];
        int index = 0;
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print("Element [" + i + "][" + j + "]: ");
                arr2D[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                arr1D[index++] = arr2D[i][j];
            }
        }
        System.out.println("\nThe 1D array:");
        for (int i = 0; i < arr1D.length; i++){
            System.out.print(arr1D[i] + " ");
        }
        input.close();
    }
}

