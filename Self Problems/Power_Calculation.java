import java.util.*;
public class Power_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();

        double ans = Math.pow(base,exp);
        System.out.println(ans);
    }
}
