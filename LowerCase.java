class LowerCase {
    public String toLowerCase(String str) {
        //return str.toLowerCase() :)
        StringBuilder s = new StringBuilder();
        for(char c: str.toCharArray()) {
            if(c >= 'A' && c <= 'Z') {
                c =(char) (c - 'A' + 'a');
            }
            s = s.append(c);
        }
        return s.toString();
    }
}
