import java.util.Arrays;

 public class mergesort{


    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 3, 4, 1, 2};
        int[] result = mergesort(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergesort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

       
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k++] = first[i++];
            } else {
                mix[k++] = second[j++];
            }
        }

       
        while (i < first.length) {
            mix[k++] = first[i++];
        }

       
        while (j < second.length) {
            mix[k++] = second[j++];
        }

        return mix;
    }
}
