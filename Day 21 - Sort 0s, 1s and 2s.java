static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        int lo = 0;
        int mid = 0;
        int hi = arr.length-1;
        
        while(mid<=hi){
            if(arr[mid] == 0){
                swap(arr,mid,lo);
                mid++;
                lo++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr,mid,hi);
                hi--;
            }
        }
        
    }
