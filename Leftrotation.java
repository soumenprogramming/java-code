public class Leftrotation {
    public static int []left(int nums[]){
        int temp=nums[0];
        for(int i=0;i<nums.length;i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
    return nums;
}
public static void main(String[]args){
    int nums[]={1,5,8,8,59,57};
    // Leftrotation tr=new Leftrotation();
    for(int g:nums){
        System.out.println(g);
    }
    
}
}
