public class  binarysearch{

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        int element=5;
        if(binarySearch(arr,element)){
            System.out.println("Element present");
        }else
        System.out.println("Search unsuccessfull");
        
    }
    public static boolean binarySearch(int[] arr, int element){
        int left=0;
        int right=arr.length-1;

        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]==element){
                return true;
            }
            if(arr[mid]>element){
                right=mid-1;
            }
            else
            left=mid+1;
        }
        return false;
    }
}