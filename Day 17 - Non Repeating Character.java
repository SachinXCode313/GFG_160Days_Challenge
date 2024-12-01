static char nonRepeatingChar(String s) {
        int maxChar = 26;
        int[] alphabet = new int[maxChar];
        
        for(int i=0;i<s.length();i++){
            alphabet[s.charAt(i) - 'a']++;
        }
        
        for(int i=0;i<s.length();i++){
            if(alphabet[s.charAt(i) - 'a'] == 1){
                return s.charAt(i);
            }
        }
        return '$';
    }
