public class Main {
    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            String temp = "";
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (temp.indexOf(c) == -1) {
                    temp += c;
                    if (temp.length() > maxLen) {
                        maxLen = temp.length();
                    }
                } else {
                    break;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String input = sc.next();
        System.out.print(lengthOfLongestSubstring(input));
        sc.close();
    }
}