import java.util.Arrays;
public class MergeSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        int[] x = mergeSort(a);
        System.arraycopy(x, 0, a, 0, a.length);

    }

    int[] merge(int[] a1, int[] a2){
        int[] out = new int[a1.length + a2.length];
        int i = 0;
        int i1 = 0;
        int i2 = 0;
        while(a1.length -i1 >0 && a2.length -i2 >0){
            if (a1[i1] > a2[i2]){
                out[i] = a2[i2];
                //a2 = Arrays.copyOfRange(a2, 1, a2.length);
                i2++;
                i++;
            } else {
                out[i] = a1[i1];
                //a1 = Arrays.copyOfRange(a1, 1, a1.length);
                i1++;
                i++;
            }


        }

        while (a1.length -i1 > 0){
            out[i] = a1[i1];
            //a1 = Arrays.copyOfRange(a1, 1, a1.length);
            i1++;
            i++;
        }

        while (a2.length -i2 > 0){
            out[i] = a2[i2];
            //a2 = Arrays.copyOfRange(a2, 1, a2.length);
            i2++;
            i++;
        }
        //System.out.println(Arrays.toString(out));
        return out;
    }

    int[] mergeSort(int[] a){
        if (a.length <= 1){
            return a;
        }
        int[] a1 = Arrays.copyOfRange(a,0,a.length/2);
        int[] a2 = Arrays.copyOfRange(a,a.length/2 ,a.length);

        a1 = mergeSort(a1);
        a2 = mergeSort(a2);


        return(merge(a1,a2));
    }


    public static void main(String args[]){
        int[] a = {5,4,3,2,1,8};

        System.out.println(Arrays.toString(a));
        MergeSort m = new MergeSort();
        m.sort(a);
        System.out.println(Arrays.toString(a));

        //System.out.println(Arrays.toString(a));


    }
}
