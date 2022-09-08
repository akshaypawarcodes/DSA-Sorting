public class SelectionSort {
    public static void selectionSort(int[] arr, int n) {

        for(int i=0; i<n; i++){
            int curr=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[curr]){
                    curr= j;
                }
            }
            //swap element
            int temp=arr[curr];
            arr[curr]=arr[i];
            arr[i]=temp;
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int[] arr={12,15,48,24,3,18,32};
        selectionSort(arr, arr.length);
    }
}
