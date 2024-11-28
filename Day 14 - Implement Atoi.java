public int myAtoi(String s) {
        s = s.replace(" ","");
        int sign = 1;
        int res = 0;
        int i = 0;
        if(s.charAt(0) == '-'){
            sign = -1;
            i++;
        }
        
        while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            if (res > Integer.MAX_VALUE / 10 || 
                   (res == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            res = res * 10 + (s.charAt(i) - '0');
            i++;
        }
        
        return res*sign;
    }
