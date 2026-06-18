public class pattern {
    public static void main(String[] args) {
        int n = 5;
        int cnt=1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(cnt);
                cnt++;
            }
            System.out.println();
        }
    }
}
