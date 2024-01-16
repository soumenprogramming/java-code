public class Besttimetosellandbuy {
    public static int time(int prices[]){
        int buy=Integer.MAX_VALUE;
        int sell=0;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            sell=Math.max(sell,prices[i]-buy);
        }
        return sell;
    }
    public static void main(String[]args){
        int prices[]={11,4,7,5,8};
        System.out.println(Besttimetosellandbuy.time(prices));
    }
}
