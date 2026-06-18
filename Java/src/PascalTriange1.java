import java.util.ArrayList;
import java.util.List;

public class PascalTriange1 {

    public static void main(String[] args) {
        int n=5;
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer>temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    temp.add(1);
                }else{
                    temp.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(temp);
        }
        System.out.println(ans);
    }
}
