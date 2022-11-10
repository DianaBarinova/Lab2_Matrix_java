package lab_2_2;
import java.io.*;
import java.sql.Array;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.util.Arrays;
public class lab_2_2 {
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

        if (m != 20) {
            System.out.println("v stroke ne 20 chisel");
        }
        FileWriter fw = new FileWriter("out.txt");
        
        int[] mas = new int[m];
        int tm=0;
for(int i=0; i<n;i++){
    int count=0;
        for(int j=0; j<m; j++ ) {
           mas[j]=matrix[i][j];
        }
         Arrays.sort(mas);
        for (int k=0; k<m; k++){
            if(mas[k]==(k+1)){
                count++;
            }
        }
        if(count==20){
            for(int u=0; u<m; u++){
                fw.write(matrix[i][u] + " ");
            }
            fw.write('\n');
            tm++;
        }

}
        if(tm==0){
            System.out.println("takix strok net");
        }
        fw.close();

    }
}
