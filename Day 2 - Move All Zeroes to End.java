 void pushZerosToEnd(int[] arr) {
        int flag = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[flag];
                arr[flag] = temp;
                flag++;
            }
        }
    }
