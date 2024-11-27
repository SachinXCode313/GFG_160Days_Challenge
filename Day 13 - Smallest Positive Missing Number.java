public int missingNumber(int[] arr) {
        int n = arr.length;
        
        boolean[] list = new boolean[n];
        
        for(int i = 0;i < n;i++){
            if(arr[i] > 0 && arr[i] <= n){
                list[arr[i]-1] = true;
            }
        }
        
        for(int i=0;i<n;i++){
            if(!list[i]){
                return i+1;
            }
        }
        
        return n+1;
    }
