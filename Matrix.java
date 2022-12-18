import java.util.*;
public class Matrix
{
    int x[][],m,n;
    void readMatrix()
    {
        Scanner ob1 = new Scanner(System.in);
        System.out.println("enter the no. of rows");
        m = ob1.nextInt();
        System.out.println("enter the no. of column");
        n = ob1.nextInt();
        x = new int[m][n];
        System.out.println("enter the matrix elements");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                x[i][j] = ob1.nextInt();
            }
        }
    }
    void writeMatrix()
    {
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.println(x[i][j]);
                System.out.println("\t");
            }
            System.out.println("\n");
        }
    }
    void addMatrix(Matrix A,Matrix B)
    {
        Matrix p=new Matrix();
        p.m=A.m;
        p.n=A.n;
        p.x=new int[p.m][p.n];
        if(A.m==B.m && A.n==B.n)
        {
            System.out.println("the sum of the 2 matrices");
            for (int i = 0; i < p.m; i++)
            {
                for (int j = 0; j < p.n; j++)
                {
                    System.out.println(p.x[i][j] = A.x[i][j] + B.x[i][j]);
                    System.out.println("\t");
                }
                System.out.println("\n");
            }
        }
        else
        {
            System.out.println("Addition of matrix not possible");
        }
    }
    void multiplyMatrix(Matrix A,Matrix B)
    {
        Matrix q=new Matrix();
        q.m=A.m;
        q.n=B.n;
        int k;
        q.x=new int[q.m][q.n];
        if(A.n==B.m)
        {
            System.out.println("the multiplication of the 2 matrices");
            for (int i = 0; i < q.m; i++)
            {
                for (int j = 0; j < q.n; j++)
                {
                    q.x[i][j] = 0;
                    for (k = 0; k < A.n; k++)
                    {
                        System.out.println(q.x[i][j] = q.x[i][j] + A.x[i][j] * B.x[i][j]);
                        System.out.println("\t");
                    }
                }
                System.out.println("\n");
            }
        }
        else
        {
            System.out.println("the multiplication of the 2 matrices not possible");
        }
    }
    public static void main(String args[])
    {
        Matrix A=new Matrix();
        Matrix B=new Matrix();
        Matrix C=new Matrix();
        System.out.println("read matrix A");
        A.readMatrix();
        A.writeMatrix();
        System.out.println("read matrix B");
        B.readMatrix();
        B.writeMatrix();
        C.addMatrix(A,B);
        C.multiplyMatrix(A,B);
    }

}
