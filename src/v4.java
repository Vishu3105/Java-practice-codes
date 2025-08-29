public class v4 {     //check num is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        try {
            for (int i = 0; i * i <= n; i++) {      //when i=0 instead of i=2
                if (n % i == 0) return false;      // exception arrives
            }
        }
        catch (ArithmeticException e){
            System.out.println("cant divide by 0:"+e);
        }
        return true;
    }
    public static void main(String[] args) {
        int num=11;
        boolean isprime =true;
        if (num<=1){
            isprime =false;
        }for (int i=2;i<num;i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }
        System.out.println(isprime);

        //method 2
        int n=11;
        boolean isitprime = n>1;
        for (int i=2;i*i<n;i++) {
            if (n % i == 0) {
                isitprime = false;
                break;
            }
        }
        System.out.println(isitprime);

        System.out.println(isPrime(11)); //using method
    }
}
