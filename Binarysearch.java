
public class Binarysearch
{
    public static int getposition(int nums[],int key){
        int start=0; int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==key){
                return mid;
            }
            else if(nums[mid]<key){
                start= mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		//System.out.println("Hello World");
     int nums[]={1,4,7,8,7,5,8};
     int key=7;
     int mid=getposition(nums,key);
     System.out.println(mid);
	}
}