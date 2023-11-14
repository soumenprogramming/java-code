public class Searchinrotatedsortedarray {
    static int search(int nums[],int target){
        int a=0;
        int e=nums.length-1;
        while(a<=e){
            if(nums[a]==target){
                return a;
            }
            if(nums[e]==target){
                return e;
            }
            a++;
            e--;
        }
        return -1;
    }
    public static void main(String[]args){
        int nums[]={1,8,5,9,6};
        int target=6;
       
        int a=Searchinrotatedsortedarray.search(nums, target);
        System.out.println(a);
    }
}
