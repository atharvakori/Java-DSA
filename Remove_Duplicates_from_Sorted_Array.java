<H1>Method 1</H1>

class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            if(index == 0 || nums[index-1] != nums[i]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}

----------------------------------
<H1>Method 2</H1>

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for(int num : nums){
            uniqueNums.add(num);
        }
        int result[] = new int[uniqueNums.size()];
        int index = 0;
        for(int num : uniqueNums){
            result[index++] = num;
        }
        int i = 0;
        for(int num : result){
            nums[i++] = num;
        }
        return uniqueNums.size();
    }
}
