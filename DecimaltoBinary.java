public class DecimaltoBinary
{
    public static int check(int n){
        int power=0;
        int bin=0;
        while(n!=0){
            int lastdigit=n%2;
            bin=bin+lastdigit*(int)Math.pow(10,power);
            power++;
            n=n/2;
        }
        return bin;
    }
	public static void main(String[] args) {
     System.out.println(check(5));
	

	}
}
