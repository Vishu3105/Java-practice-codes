public class v6 { //factorial of a num

    public static long factorial(int n){
        if (n==0||n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        long fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);

        //using while
        int j=1;
        int x=5;
        long fact1=1;
        while (j<=x){
            fact1*=j;
            j++;
        }
        System.out.println(fact1);

        //using rec method
        System.out.println(factorial(5));
    }
}
