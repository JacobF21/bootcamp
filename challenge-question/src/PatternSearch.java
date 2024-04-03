public class PatternSearch {
    public static void main(String[] args) {
        String Pattern = "cd";
        String s = "abcdefg";

        // outerloop used to check the pattern match or not
        // innerloop used to create all the possible pattern of string s
        for (int i = 0; i < s.length() - Pattern.length() + 1; i++) {
            String temp = "";
            for (int j = 0; j < Pattern.length(); j++) {
                temp += s.charAt(i + j);
            }
            //System.out.println(temp);
            if (temp.equals(Pattern)) {
                System.out.println("True");
            }
        }
    }
}
