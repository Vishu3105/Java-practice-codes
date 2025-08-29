public class v12 { //reverse a number

    //using recursion
    static int reverse(int num,int rev) {
        if (num == 0) {
            return rev;
        }
        return reverse(num / 10, rev * 10 + num % 10);
    }

    public static void main(String[] args) {
//        int n=1234;
//        int rev=0;
//        while (n>0){
//            int digit=n%10;
//            rev=rev*10+digit;
//            n/=10;
//        }
//        System.out.println(rev);

        //convert to str & reverse
        int num=4321;
        String str=String.valueOf(num);
//        String str=Integer.toString(num);  //another method to convert
        String reversed=new StringBuilder(str).reverse().toString();
        int result=Integer.parseInt(reversed);
        System.out.println(result);


        System.out.println(reverse(1234,0));

    }
}
