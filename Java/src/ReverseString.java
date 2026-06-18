public class ReverseString {
    public static void reverseStr(String str){
        int n=str.length();
        String[] arr=str.split(" ");
        for (int i = arr.length-1;i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        String str="Welcome to the Coding Ninjas";
        reverseStr(str);

    }
}