public class InsertionSort {
    public static void insertionSort(int n , int[] arr) {
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={12,15,48,24,3,18,32};
        int n=arr.length;
        for(int i=1; i<n; i++){

            int currval=arr[i];
            int indx=i-1;

            while(indx>=0 && arr[indx]>currval){
                arr[indx+1]=arr[indx];
                indx--;
            }
            arr[indx+1]=currval;
        }
        insertionSort(arr.length,arr);
    }
}
