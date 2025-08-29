import java.util.Arrays;

public class v17 {        // sort an array without using built-in func
    public static void main(String[] args) {
        //Bubble sort
        int[] arr={21,9,11,15,18,7};
        int n=arr.length;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int num:arr){
            System.out.print(num+" ");
            }
        System.out.println(Arrays.toString(arr));  //to get in array form

        //selection sort
        for (int i=0;i<n-1;i++){
            int min=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        }
    }

