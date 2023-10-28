class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1){
            return;
        }

        int zeroindex = 0;

        for(int i = 0 ; i<nums.length;i++){

            if(nums[i] != 0){

                nums[zeroindex] = nums[i];

                zeroindex++;

            }

        }

        
        for(int j = zeroindex ; j<nums.length;j++){

            nums[j] = 0;

        }
        
        
    }
}