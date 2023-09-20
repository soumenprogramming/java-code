 class Nextpermutation {
    public void Next_permutation(int nums[]){
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=nums.length-1;
            while(j>i && nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    public void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[i+1];
        nums[i+1]=temp;
    }
    public void reverse(int []nums,int start){
        int end=nums.length-1;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
            }
        }
        public static void main(String[]args){
            int nums[]={1,2,3};
            Nextpermutation next=new Nextpermutation();
            next.Next_permutation(nums);
            // System.out.println(next.Next_permutation(nums[1,2,3]));
            for(int x:nums){
                System.out.println(x+" ");
            }
        }
    }

