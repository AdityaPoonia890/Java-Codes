package DSA;

class Solution {
    public int[] frequencySort(int[] nums) {
        int[] count=new int[nums.length];
        int[] arr=new int[100];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i]){
                arr[count]=nums[j];
                count++;
                }
                
            }

        }return arr;
        
    }
    
}
class SortFreq{
    public static void main(String[] args) {
        int[] nums={1,1,3,2,2,2};
        int Arr[]=new int[nums.length+1];
        Solution s=new Solution();
        Arr= s.frequencySort(nums);
        for(int x:Arr){
            System.out.println(x);
        }
    }
}