import java.util.Arrays;

public class NextPermutation {
    private static void swap(int[] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private static int[] ans(int[]arr,int n){

        int ind=-1;

        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            Arrays.sort(arr);
        }
        for(int i=n-1;i>=ind;i--) {
            if (arr[i] > arr[ind]) {
                swap(arr, i, ind);
                break;
            }
        }
        Arrays.sort(arr,ind+1,arr.length);
        return arr;

    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int len=arr.length;
        int[] res=ans(arr,len);
        System.out.print(Arrays.toString(res));
    }
}
