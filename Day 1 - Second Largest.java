    public int getSecondLargest(int[] arr) {
        int firstLarge = -1;
        int secondLarge = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > firstLarge){
                secondLarge = firstLarge;
                firstLarge = arr[i];
            }
            else if(arr[i] > secondLarge && arr[i] != firstLarge){
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }
