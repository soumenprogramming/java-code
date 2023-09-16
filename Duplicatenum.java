import java.util.Arrays;

class Duplicatenum {
    public boolean duplicate(int nums[]){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;

    }
    public static void main(String[]args){
        int nums[]={14,4,5,8,9};
        Duplicatenum dup=new Duplicatenum();
        System.out.println(dup.duplicate(nums));
    }
}
