class Solution {
    public void moveZeroes(int[] arr) {
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        for(int i = index; i < arr.length; i++){
            arr[i] = 0;
        }
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0; // for zero and `i` is for non-zero
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                if(i != index){
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp; 
                }
                index++;
            }
        }
    }
}
