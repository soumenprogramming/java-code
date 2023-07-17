
//Reversing of a String in java


import java.util.*;
class Reverse
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
          rev=rev+str.charAt(i);            
        }
        System.out.println(rev);

    }
}
//Reversing of a String in java


//Reversing of a Number
