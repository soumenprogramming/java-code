import java.util.Arrays;

public class Chocolatedistribute {
    public int minchoco(int ch[],int a,int b){
        if(a==0 || b==0){
            return 0;
        }
        if(b>a){
            return -1;
        }
        Arrays.sort(ch);
        int min_diff=Integer.MAX_VALUE;
        for(int i=0;i<i+b-1;i++){
         int diff=ch[i+b-1]-ch[i];
         if(diff<min_diff)
         min_diff=diff;
        }
        return min_diff;

    }
    public static void main(String[]args){
        int ch[]={1,8,45,8,174,23};
        int b=3;
        Chocolatedistribute choco=new Chocolatedistribute();
        System.out.println(choco.minchoco(ch,2,b));
    }
}
