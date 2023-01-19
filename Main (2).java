public class Main {

    public static void renovasi (int n)
    {
        int x, i;
        for (x = 0; x < n; x++)
        {
            for (i = 2*(n-x); i >= 0;i--)
            {
                System.out.print(" ");
            }
            for (i = 0; i <= x; i++)
            {
                System.out.print(";)");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int s = 5;
        renovasi(s); 
    }
}