public static boolean areAnagrams(String s1, String s2) {
        int maxChar = 26;
        int freq[] = new int[maxChar];
        
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i) - 'a']++;
        }
        for(int j=0;j<s2.length();j++){
            freq[s2.charAt(j) - 'a']--;
        }
        
        for(int k=0;k<freq.length;k++){
            if(freq[k] != 0){
                return false;
            }
        }
        
        return true;
    }
