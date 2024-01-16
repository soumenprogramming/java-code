public class Trappedwater
{
    public static int savedwater(int nums[]){
        int n=nums.length;
        int leftmax[]=new int[n];
        leftmax[0]=nums[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(nums[i],leftmax[i-1]);
        }
        int rightmax[]=new int[n];
        rightmax[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(nums[i],rightmax[i+1]);
        }
         int savedwater=0;
        for(int i=0;i<n;i++){
           int waterlevel=Math.min(rightmax[i],leftmax[i]);
        savedwater +=(waterlevel-nums[i]);
            
        }
        return savedwater;
        
    }
	public static void main(String[] args) {
      int nums[]={1,4,7,8,5,8};
      int n=Trappedwater.savedwater(nums);
      System.out.println(n);
	}
}
