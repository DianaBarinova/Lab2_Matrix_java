package lab_2_3;
import java.io.*;
import java.sql.Array;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;

public class lab2_3 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("in.txt");

        Scanner scanner = new Scanner(fr);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        fr.close();
        FileWriter fw = new FileWriter("out.txt");
        int tmp;
        for (int i=0; i < m; i++) {
            for (int k=i+1; k < m; k++) {
                if (matrix[0][i] > matrix[0][k]){
                    for (int j=0; j < n; j++) {
                        tmp = matrix[j][i];
                        matrix[j][i]=matrix[j][k];
                        matrix[j][k]=tmp;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                fw.write(matrix[i][j] + " ");
            }
            fw.write('\n');
        }
        fw.close();
    }
    }
