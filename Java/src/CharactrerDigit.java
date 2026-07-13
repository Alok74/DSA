public class CharactrerDigit {
    public static void main(String[] args) {
        String str="aaabbccccddaa";
        int cnt=1;
        StringBuilder sb=new StringBuilder();
        int n=str.length();
        for(int i=1;i<n;i++){
            if(str.charAt(i)==str.charAt(i-1)){
                cnt++;
            }else{
                sb.append(str.charAt(i-1));
                sb.append(cnt);
                cnt=1;
            }
        }
            sb.append(str.charAt(str.length()-1));
            sb.append(cnt);
        System.out.println(sb.toString());
    }    
}
