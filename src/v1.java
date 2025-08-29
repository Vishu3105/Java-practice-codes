public class v1 {
    public static void main(String[] args) {
        //reverse a string
        String a="vishu";
        String b="";
        for (int i=a.length()-1;i>=0;i--){
            b += a.charAt(i);
        }
        System.out.println(b);

        //swap two num without third var
        int x=10,y=20;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x="+x+" y="+y);
        //other method
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("x="+x+" y="+y);
        //other method
        x=x*y;
        y=x/y;
        x=x/y;
        System.out.println("x="+x+" y="+y);
    }
}
