public class QuickSort {
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low; j<high; j++){
            //condition check
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    public static void quicksort(int[] arr, int low, int high){
        if(low<high){
            int pivindx = partition(arr, low,high);
            quicksort(arr, low,pivindx-1);
            quicksort(arr,pivindx+1,high);

        }
    }
    public static void main(String[] args) {
        int[] arr= {12,15,48,24,3,18,32};
        int n= arr.length;
        quicksort(arr,0,n-1);

        //print
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
//    public int[] sortArray(int[] nums) {
//        Arrays.sort(nums);
//        return nums;
//    }