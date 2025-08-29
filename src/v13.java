public class v13 {       //multiplication of a num

    //using recursion
    public static void table(int num,int i){
        if (i>10)return;
        System.out.println(num + "x" + i + "=" + num * i);
        table(num,i+1);
    }
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=10;i++) {
            System.out.println(n + "x" + i + "=" + n * i);
//            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }

        //using while
        int x=10;
        int i=1;
        while (i<=10){
            System.out.println(x + "x" + i + "=" + x * i);
            i++;
        }

        table(9,1);
    }
}
