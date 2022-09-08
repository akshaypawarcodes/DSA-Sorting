public class MergeSort {
     public static void conquer(int[] arr, int si, int mid, int ei){
        int[] merge=new int[ei-si+1];
        int indx1=si;
        int indx2=mid+1;
        int k=0;
        while (indx1<=mid && indx2<=ei){
            if(arr[indx1]<=arr[indx2]){
                merge[k]=arr[indx1];
                k++;
                indx1++;
            }else {
                merge[k]=arr[indx2];
                k++;
                indx2++;
            }
        }
        while(indx1<=mid){
            merge[k]=arr[indx1];
            k++;
            indx1++;
        }
        while(indx2<=ei){
            merge[k]=arr[indx2];
            k++;
            indx2++;
        }
        for(int i=0, j=si; i<merge.length; i++,j++){
            arr[j]=merge[i];
         }
    }
    public static void devide(int[] arr, int si, int ei){
       if(si>=ei){
           return;
       }
       int mid=si+(ei-si)/2;
       devide(arr, si,mid);
       devide(arr,mid+1,ei);
       conquer(arr,si,mid,ei);
    }

    public static void main(String[] args) {
        int[] arr={12,15,48,24,3,18,32};
        int n= arr.length;
        devide(arr,0,n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
