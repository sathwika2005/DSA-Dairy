package Strings;

import java.util.*;

public class GroupAnagrams49 {
    public static String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        return sorted;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sortString(strs[i]);
            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string array size : ");
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the string : ");
            strs[i] = sc.next();
        }
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
        sc.close();
    }
}
