public class v5 {
    static int fibonacci(int n){
        if (n<=1)return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        int a=0,b=1,n=10;
        int sum=0;
        for (int i=0;i<n;i++){
            System.out.print(a+" ");
            int next=a+b;
            sum+=a;
            a=b;
            b=next;
        }
        System.out.println("\n" +sum);
        // recursion by creating method func
        System.out.println(fibonacci(10));
        for (int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }
        System.out.println(" ");
        // using array dp
        int x=10;
        int[] fib = new int[x];
        fib[0]=0;
        fib[1]=1;
        for (int i=2;i<n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        System.out.println(fib[9]);
        for (int i=0;i<n;i++)
            System.out.print(fib[i]+" ");

    }
}
