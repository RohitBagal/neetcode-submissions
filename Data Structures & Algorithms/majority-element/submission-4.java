class Solution {
    public int majorityElement(int[] nums) {
        int maj = nums[0];
        int counter = 0;

        for(int i=0;i<nums.length;i++){
            if(counter == 0){
                maj = nums[i];
            }
            if(nums[i]==maj) counter++;
            else counter--;
            
        }
        return maj;
    }
}