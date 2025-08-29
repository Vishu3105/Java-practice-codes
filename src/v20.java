import java.util.Arrays;

public class v20 {     //check if two strings are anagrams:
    public static void main(String[] args) {
        String str1="silent";
        String str2="listen";

        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();

        if (str1.length()!=str2.length()){
            System.out.println("not an anagram");
        }
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2)){
            System.out.println("anagram");
        }else {
            System.out.println("not an anagram");
        }
    }
}
