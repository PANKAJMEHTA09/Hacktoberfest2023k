import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Distinctelement {

    public static int DistinctElements(int array[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            hs.add(array[i]);
        }

        return hs.size();

    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        DistinctElements(array);

    }
}
