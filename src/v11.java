public class v11 {   // sum of digits

    //using recursion
    static int sumDigits(int num) {
        if (num == 0) {
            return 0;
        }return (num%10)+sumDigits(num/10);
    }
    public static void main(String[] args) {
//        int num=1234;
//        int sum=0;
//        while (num>0){
//            sum+=num%10;
//            num/=10;
//        }
//        System.out.println(sum);
        int n=2345; //recursion
        System.out.println(sumDigits(n));

        //using string conversion
        String num="1234";
        int sum=0;
        //String str=String.valueOf(num);  //when input is num. use this
        for (char c:num.toCharArray()){    //when input is string
            sum+=Character.getNumericValue(c);
        }
        System.out.println(sum);

    }
}
