public class kadanes{
    public static void main(String[] args) {
        int[] arr= {1,-2,5,2,5,6,7,8,-9};
        maxsum(arr);
    }
    public static void maxsum(int[] arr){
        int maxresult=arr[0];
        int tempresult=arr[0];

        for(int i=1;i<arr.length;i++){
            tempresult=Math.max(arr[i],tempresult+arr[i]);
            maxresult=Math.max(maxresult, tempresult);

        }
        System.out.println("Max result"+ maxresult);
    }
}