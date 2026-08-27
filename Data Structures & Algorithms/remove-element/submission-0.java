class Solution {
    public int removeElement(int[] nums, int val) {
      int ans[] = new int[nums.length];
      int k=0;
      for(int i : nums){
        if(i != val){
            ans[k] = i;
            k++;
        }
      }
      int j = 0;
      for(int i: ans){
        nums[j] = i;
        j++;
      }

      return k;  
    }
}