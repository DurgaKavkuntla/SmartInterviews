import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList();
        while (sc.hasNext()) {
            li.add(sc.nextInt());
        }
        for (int k = 1; k < li.size(); k++) {
            int n = li.get(k);
            System.out.println("Case #" + k + ":");
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }


    }

}