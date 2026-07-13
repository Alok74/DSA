public class FirstCharUpper {
    public static void main(String[] args) {
        String str="java love spring";
        int n=str.length();
        StringBuilder sb=new StringBuilder();
        String[] arr=str.split(" ");
       for(String word:arr){
        sb.append(Character.toUpperCase(word.charAt(0)));
        sb.append(word.substring(1));
        sb.append(" ");
       }
       System.out.println(sb.toString());
    }
}
