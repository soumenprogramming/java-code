public class Rightrotation {
    public int [] right(int nums[]){
        int t=nums.length;
        int temp=nums[t-1];
        for(int i=t-1;i>0;i--){
            nums[i]=nums[i-1];

        }
        nums[0]=temp;
        return nums;
       

    }
     public static void main(String[]args){
            int nums[]={1,8,6,9};
           Rightrotation rt=new Rightrotation();
           int rot[]=rt.right(nums);
           for(int x:rot){
            System.out.println(x);
           }
        }
}
