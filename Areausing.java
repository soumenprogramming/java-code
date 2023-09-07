class Radious {
    public double radious;

    public double area() {
        return Math.PI * radious * radious;
    }

    public double perimeter() {
        return 2 * Math.PI * radious;
    }
}

public class Areausing {
    public static void main(String[] args) {
        Radious a1 = new Radious();
        a1.radious = 5.4;  
        System.out.println(a1.area());
    }
}
