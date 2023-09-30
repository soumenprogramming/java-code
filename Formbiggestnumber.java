import java.util.Arrays;
import java.util.Comparator;

public class Formbiggestnumber {
    public static String formbig(int[]nums){
      String []str=Arrays.stream(nums).mapToObj(Integer::toString).toArray(String[]::new);
      Comparator<String> customcom=(a,b) ->(b+a).compareTo(a+b);
      Arrays.sort(str,customcom);
      if(str[0].equals("0")){
        return "0";
      }
      return String.join(" ",str);
    }
    public static void main(String[]args){
        int nums[]={1,8,58,9};
        String str1= formbig(nums);
        System.out.println(str1);
    }
}
