import java.util.Arrays;

public class QuickSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        quickSort(a, 0, a.length-1);
    }

    void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int index = (low-1);
        for (int k=low; k<high; k++)
        {
            if (arr[k] <= pivot)
            {
                index++;
                swap(arr, index, k);
            }
        }

        swap(arr, index + 1, high);

        return (index+1);
    }

    void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    public static void main(String args[]){




        QuickSort q = new QuickSort();
        int[] o = {3,6,1,2,6,4,2,6,4};
        System.out.println(Arrays.toString(o));

        q.sort(o);
        System.out.println(Arrays.toString(o));
    }


}
