public class Selectionsort {
    public static void select(int nums[]){
        for(int i=0;i<nums.length;i++){
            int minpos=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minpos]>nums[j]){
                    minpos=j;
                }
            }
            int temp=nums[minpos];
            nums[minpos]=nums[i];
            nums[i]=temp;
        }
       

    }
    public static void sel(int nums[]){
        for(int i=0;i<nums.length;i++){
      System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[]args){
        int nus[]={1,4,8,5,8,3};
        select(nus);
        sel(nus);
    }
}
