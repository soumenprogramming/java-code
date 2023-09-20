public class Buyandsellstock {
    public int buyandsell(int prices[]){
        int min=Integer.MAX_VALUE;
        int a=0;
        int b=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            
            }
            b=prices[i]-min;
            if(a<b){
                a=b;
            }
        }
        return a;
    }
    public static void main(String[]args){
        int prices[]={7,8,1,10,45};
        Buyandsellstock buy=new Buyandsellstock();
        int vb=buy.buyandsell(prices);
        System.out.println(vb);
    }
}
