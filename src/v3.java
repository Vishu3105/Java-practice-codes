public class v3 {
    public static void main(String[] args) {
        //largest among 3 num
        int a=10,b=15,c=30;
        if (a>=b&&a>=c) {
            System.out.println("largest is a:"+a);
        }
        else if(b>=a&&b>=c) {
            System.out.println("largest is b:"+b);
        } else {
            System.out.println("largest is c:"+c);
        }
//        //method 2
        int largest=Math.max(a,Math.max(b,c));
        System.out.println(largest);
        //method 3
        int large=((a>b)?(a>c?a:c):(b>c?b:c));
        System.out.println(large);
    }
}
