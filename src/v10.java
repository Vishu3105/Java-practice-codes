public class v10 {       // check armstrong num (1^3+5^3+3^3=153)
    public static void main(String[] args) {
        // only for 3 digit numbers
//        int num=153;
//        int original=num;
//        int result=0;
//        while (num>0){
//            int digit=num%10;
//            result+=digit*digit*digit;
//            num/=10;
//        }

        //any no of digits (num == each digit to the power of no of digits)
        int num=9474;
        int original=num;
        int n=String.valueOf(num).length();
        int result=0;
        while (num>0){
            int digit=num%10;
            result+=Math.pow(digit,n);
            num/=10;
        }

        if (result==original){
            System.out.println(original+" is a armstrong");
        }else
            System.out.println(original+" not a armstrong");
    }
}
