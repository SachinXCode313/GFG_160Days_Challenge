    int maxProduct(int[] arr) {
        int maxPro = Integer.MIN_VALUE;
        int n = arr.length;
        int prefix = 1;
        int sufix = 1;
        
        for(int i=0;i<arr.length;i++){
            if(prefix == 0){
                prefix = 1;
            }
            if(sufix == 0){
                sufix = 1;
            }
            prefix *= arr[i];
            sufix *= arr[n-i-1];
            maxPro = Math.max(maxPro, Math.max(prefix,sufix));
        }
        return maxPro;
    }
