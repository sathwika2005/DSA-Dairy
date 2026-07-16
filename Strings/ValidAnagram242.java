package Strings;

import java.util.*;

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.next();
        System.out.print("Enter a String : ");
        String t = sc.next();
        ValidAnagram242 obj = new ValidAnagram242();
        System.out.println("Is valid Anagram ? " + obj.isAnagram(s, t));
        sc.close();
    }
}
