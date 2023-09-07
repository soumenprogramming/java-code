class Rectangle{
    public double side1,side2;
    public double area(){
        return side1*side2;
    }
    public double perimeter(){
        return 2*(side1+side2);
    }

}
public class Rectangle1 {
    public static void main(String[]args){
    double side3=10.23,side4=20.36;
    Rectangle r1=new Rectangle();
    r1.side1=side3;
    r1.side2=side4;
    System.out.println(r1.area());
    System.out.println(r1.perimeter());
    }
}
