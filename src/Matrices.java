import java.util.Scanner;

public class Matrices {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Matriz [][],nFilas,nCol;
        Matriz = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("ingrese el numero de filas");
        nFilas = sc.nextInt();
        System.out.println("ingrese el numero de columnas");
        nCol = sc.nextInt();
        Matriz = new int [nFilas] [nCol];
        System.out.println("digite la matriz");
        for (int i =0;i<nFilas;i++)
        {
            for (int j=0;j<nCol;j++)
            {
                System.out.print(Matriz[i][j]);

            }
            System.out.println("");
        }
    }
}
