public class BinarytoDecimal
{
    public static int check(int n){
        int power=0;
        int dec=0;
        while(n!=0){
            int lastdigit=n%10;
            dec=dec+lastdigit*(int)Math.pow(2,power);
            power++;
            n=n/10;
        }
        return dec;
    }
	public static void main(String[] args) {
     System.out.println(check(101));
	

	}
}
