import java.util.*;
public class Leap_year {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the desired year to find the year is leapyear or not :");
        int year=sc.nextInt();
        if(year%4==0){
          if(year%100==0){
            if(year%400==0){
                System.out.println("entered year is a leapyear.");
            }
            else{
                System.out.println("entered year is not a leapyear.");
            }
          }
          else{
            System.out.println("entered year is a leapyear.");
          }
        }
        else{
            System.out.println("entered year is not a leapyear.");
        }
    }
}
