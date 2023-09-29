public class Maxproductsubarray {
    public int maxproduct(int nums[]){
        if(nums==null || nums.length==0){
            return 0;
        }
        int max=nums[0],min=nums[0],result=nums[0];
        for(int i=0;i<nums.length;i++){
            int temp=max;
            max=Math.max(Math.max(nums[i]*max,nums[i]),nums[i]*min);
            min=Math.min(Math.min(nums[i]*temp,nums[i]),min*nums[i]);
            if(max>result){
                result=max;
            }
            
        }
        return max;

    }
    public static void main(String[]args){
        int nums[]={1,5,8,9};
        Maxproductsubarray max=new Maxproductsubarray();
        int num1=max.maxproduct(nums);
        System.out.println(num1);
    }
}
