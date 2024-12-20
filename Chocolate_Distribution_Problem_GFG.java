class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        if(arr.size() == 0){
            return 0;
        }
        Collections.sort(arr);
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < arr.size()-m+1;i++){
            int min = arr.get(i);
            int max = arr.get(i+m-1);
            result = Math.min(result, max-min);
        }
        return result;
    }
}
