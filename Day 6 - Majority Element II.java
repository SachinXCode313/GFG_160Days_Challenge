    public List<Integer> findMajority(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        Arrays.sort(nums);
        int n = nums.length;
        int i=0;
        int count = 1;
        
        while(i<n-1){
            if(nums[i] != nums[i+1]){
                if(count > (n/3)){
                    result.add(nums[i]);
                }
                count = 0;
            }
            count++;
            i++;
        }

        if (count > n / 3) {
            result.add(nums[n - 1]);
        }
        
        return result;
    }
