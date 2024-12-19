class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1, max = 0;
        while(left<right){
            int lHeight = height[left];
            int rHeight = height[right];
            int minHeight = Math.min(rHeight, lHeight);
            max = Math.max(max,minHeight*(right-left));
            if(lHeight<rHeight) left++;
            else right--;
        }
        return max;
    }
}
