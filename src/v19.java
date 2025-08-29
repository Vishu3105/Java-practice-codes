import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class v19 {     //Remove duplicates from an array
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 7, 2, 5, 3, 9};
        int n = arr.length;
        int[] temp = new int[n];
        int newSize = 0;
        for (int k : arr) {
            boolean isDuplicate = false;
            for (int j = 0; j < newSize; j++) {
                if (k == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[newSize++] = k;
            }
        }
        for (int i=0;i<newSize;i++){
            System.out.print(temp[i]+" ");
        }
        int[] result=Arrays.copyOf(temp,newSize);   //output in array
        System.out.println(Arrays.toString(result));

        //using java 8 stream
        int[]unique=Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(unique));

        // using set
        Integer[]ar={8, 3, 5, 7, 2, 5, 3, 9};
        Set<Integer> uni=new LinkedHashSet<>(Arrays.asList(ar));
        System.out.println(uni);
    }
}
