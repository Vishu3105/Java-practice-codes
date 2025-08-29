import java.util.Arrays;
import java.util.Collections;

public class v16 { //find small & large in an array
    static void findminmax(int[] arr, int index, int[]result){
        if (index== arr.length)return;
        if (arr[index]< result[0])result[0]= arr[index];
        if (arr[index]> result[1])result[1]= arr[index];
        findminmax(arr,index+1,result);
    }

    public static void main(String[] args) {
        int[] arr={12,15,19,30,8,22};
//        int small=arr[0];
//        int large=arr[0];
//        for (int i=1;i<arr.length;i++){
//            if (arr[i]<small){
//                small=arr[i];
//            }
//            if (arr[i]>large){
//                large=arr[i];
//            }
//        }
//        System.out.println("smallest:"+small);
//        System.out.println("largest:"+large);

        //using sorting
        Arrays.sort(arr);
        System.out.println("small:"+arr[0]);
        System.out.println("large:"+arr[arr.length-1]);

        //using java 8 streams
        int min=Arrays.stream(arr).min().getAsInt();
        int max=Arrays.stream(arr).max().getAsInt();
        System.out.println(min);
        System.out.println(max);

        //if array is integer type
        Integer[] ar = {12, 5, 8, 20, 5, 15};
        System.out.println(Collections.min(Arrays.asList(ar)));
        System.out.println(Collections.max(Arrays.asList(ar)));

        //using recursion
        int[] result={arr[0],arr[0]};
        findminmax(arr,1,result);
        System.out.println("smallest "+result[0]);
        System.out.println("largest "+result[1]);

    }
}
