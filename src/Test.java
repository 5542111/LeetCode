public class Test {
    public static  int sum=0;
    public static void main(String[] args) {
        Main();
    }
    public static void Main()
    {
        int i;
        i = x(x(8));
        System.out.println(sum);
    }
    public static int x(int n)
    {
        sum++;
        if (n <= 3)
            return 1;
        else
            return x(n - 2) + x(n - 4) + 1;
    }
}
