public class v7 {      //reverse a string
    public static String reverse(String z){
        if (z.isEmpty())
            return z;
        return reverse(z.substring(1))+z.charAt(0);
    }
    public static void main(String[] args) {
        String x="";
        String name="vishwas";
        for (int i=name.length()-1;i>=0;i--){
            x+=name.charAt(i);
        }
        System.out.println(x);

        // using string builder
        String str="hello";
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());

        //using char[]array
        String strr="sanju";
        char[] ch=strr.toCharArray();
        for (int i=0,j=ch.length-1;i<j;i++,j--){
            char temp =ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
        }
        System.out.println(new String(ch));

        // using recursion
        System.out.println(reverse("pes"));

    }
}
