class Morse_rep{
    public int uniqueMorseRepresentations(String[] words) {
        String[] table = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set ans = new HashSet<String>();
        for(int i=0;i< words.length;i++){ 
            StringBuilder s = new StringBuilder();
            for(char c: words[i].toCharArray()){
                s.append(table[c-'a' ]);
            }
            ans.add(s.toString());
        }
    return ans.size();
    }
    
}
