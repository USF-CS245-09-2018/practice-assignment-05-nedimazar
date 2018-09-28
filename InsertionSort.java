import java.util.Arrays;

public class InsertionSort implements SortingAlgorithm {


    @Override
    public void sort(int[] a) {
        InsertionSort(a);
    }

    public void InsertionSort(int[] arr){

        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int k = i-1;
            while((k >= 0) && (arr[k] > temp)){
                arr[k + 1] = arr[k];
                --k;
            }
            arr[k+1] = temp;
        }

    }

    public static void main (String args[]){
        int[] arr = {3,1,67,222,1,45,21,33};
        InsertionSort n = new InsertionSort();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));


    }



}
