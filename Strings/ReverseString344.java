package Strings;

import java.util.*;

public class ReverseString344 {
    public static void reverseString(char[] s) {
        int n = s.length;
        int i = 0, j = n - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(s);
        for (char ch : s) {
            System.out.print(ch + " ");
        }
        sc.close();
    }
}
