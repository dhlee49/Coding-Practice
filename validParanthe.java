class validParenth {
    public int longestValidParentheses(String s) {
        if (s.length() < 2)  return 0;
        int[] pairs = new int[s.length()+1];
        int i=0;
        int max=0;
        int cnt = 0;
        char[] carr = s.toCharArray();
        for (char c : carr) {
            i++;
            if (c=='(') {
                cnt++;
            }
            else if (cnt > 0) {
                cnt --;
                pairs[i] = pairs[i-pairs[i-1]-2] + pairs[i-1] + 2;
            }           
            max = Math.max(max,pairs[i]);
        }
        return max;
    }
}
