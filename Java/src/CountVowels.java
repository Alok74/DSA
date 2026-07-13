import java.util.Arrays;
import java.util.HashSet;

public class CountVowels {
    public long count(String word) {
    int n=word.length();
    long ans=0;
    long vowelcnt=0;
    HashSet<Character>set=new HashSet<>(Arrays.asList('a','e','i','o','u'));
    for(int i=0;i<n;i++){
        long res=0;
        for(int j=i;j<n;j++){
            if(set.contains(word.charAt(j))){
                res++;
            }
            ans+=res;
        }
    }
    return ans;
    }
    public static void main(String[] args) {
        String word="aba";
        CountVowels cnt=new CountVowels();
        long result=cnt.count(word);
        System.out.println(result);

    }
}
