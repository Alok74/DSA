public class intToString {
    public static void main(String[] args) {
        int n=10203004;
        String str=String.valueOf(n);
        int sum=0;
        String s="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='0'){
                s+=str.charAt(i);
            }
        }
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            sum+=digit;
        }
        int val=Integer.parseInt(s);
        int ans= val*sum;
        System.out.println(ans+" --");
    }
}
