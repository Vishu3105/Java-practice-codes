public class v2 {
    public static void main(String[] args) {
        //even or odd
        int num=22;
        if ( num%2 ==0) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
        //method 2
        if ((num & 1)==0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
        //method 3
        System.out.println((num%2)==0?"even":"odd");
    }
}
