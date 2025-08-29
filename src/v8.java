public class v8 { //check palindrome
    public static boolean isPal(String st,int start,int end){
        if (start>=end) return true;
        if (st.charAt(start)!=st.charAt(end)) return false;
        return isPal(st,start+1,end-1);
    }

    public static void main(String[] args) {
        String str = "madam";
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equals(rev)){
            System.out.println("palindrome");
        }else {
            System.out.println("not a palindrome");
        }
        System.out.println(rev);

        // using two pointer method
        boolean isPalindrome=true;
        for (int i=0,j=str.length()-1;i<j;i++,j--){
            if (str.charAt(i)!=str.charAt(j)){
                isPalindrome=false;
                break;
            }
        }
        if (isPalindrome) System.out.println("palindrome");
        else System.out.println("not a palindrome");

        // using recursion
        String st ="wow";
        if (isPal(st,0,st.length()-1)){
            System.out.println(st+" is palindrome");
        }else {
            System.out.println(st+" is not a palindrome");
        }

    }
}
