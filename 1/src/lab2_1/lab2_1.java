package lab2_1;
import java.io.*;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
public class lab2_1 {
    public static void main(String[] args) throws Exception
    {
        FileReader fr=new  FileReader("in.txt");
        FileWriter fw = new FileWriter( "out.txt" );
        Scanner scanner = new Scanner(fr);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
            {
                matrix[i][j] = scanner.nextInt();
            }
        int max_count=0;
        int quanity=n;
        int min_number=m+1;
        for(int i=0; i<n; i++)
        {

            for(int j=0; j<m; j++)
            {
                int number=0;
                int count=0;
                for(int k=0;k<m;k++)
                {
                    if(matrix[i][j]==matrix[i][k])
                    {
                        count++;
                    }
                }
                if((count > max_count)&&(count!=1)){
                    max_count = count;
                    number = i;
                    if(min_number>number)
                    {
                        min_number=number;
                    }

                }
            }
        }
        if(min_number!=m+1) {
            for (int i = 0; i < m; i++) {
                System.out.print(matrix[min_number][i] + " ");
                fw.write(matrix[min_number][i]+" ");
            }
        }
        else System.out.println(("net strok"));
        fr.close();
        fw.close();
    }

}
