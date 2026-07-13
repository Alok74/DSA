public class LastDigit {
    public static void main(String[] args) {
        String a="3";
        String b="10";
        int n1=Integer.parseInt(a);
        int n2=Integer.parseInt(b);
        long ans=1;
        for(int i=1;i<=n2;i++){
            ans=ans*n1;
        }
        System.out.println(ans);
        long res=ans%10;
        System.out.println(res);
    }
}
