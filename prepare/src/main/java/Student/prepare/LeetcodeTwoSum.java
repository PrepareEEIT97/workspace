package Student.prepare;
class Solution {
    public int[] twoSum(int[] nums, int target) {
    	int a[]=new int [2];
    	first:for(int x=0;x<=nums.length;x++){
    		boolean w=false;
    		second:for(int z=x+1;z<=nums.length-1;z++){
    			if(nums[x]+nums[z]==target){
    				a[0]=nums[x];
    				a[1]=nums[z];
    				w=true;
    				break first;
    			}
    		}
    		if(w){
    			break;
    		}
    	}
    	return a;
    }
}
public class LeetcodeTwoSum {

	public static void main(String[] args) {
		Solution sol=new Solution();
		int a[]={2,7,11,15,5};
		int value[]=sol.twoSum(a, 16);
		System.out.println(value[0]+","+value[1]);
	}
	
}
