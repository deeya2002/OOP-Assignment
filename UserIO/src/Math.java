import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter length of square:");
        int length = myObj.nextInt();
        int area= length*length;
        int perimeter = 4*length;
        System.out.println("Area of Square:"+area);
        System.out.println("Perimeter of square:"+perimeter);
    }
}

class Simple{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter principal:");
        int P = myObj.nextInt();
        System.out.print("Enter time:");
        int T = myObj.nextInt();
        System.out.print("Enter rate of interest:");
        int R = myObj.nextInt();
        int SI= (P*T*R)/100;
        System.out.println("The SI :"+SI);
    }
}

class Triangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter breadth?");
        float b = scanner.nextFloat();
        System.out.print("Enter height?");
        float h = scanner.nextFloat();
        float Area =(b*h)/2;
        System.out.println("The SI is:"+Area);
    }

}

class Volume{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length?");
        float l = scanner.nextFloat();
        System.out.print("Enter breadth?");
        float b = scanner.nextFloat();
        System.out.print("Enter height?");
        float h = scanner.nextFloat();
        float cube=l*l*l;
        float cuboid=l*b*h;
        System.out.println("The SI is:"+cube);
        System.out.println("The SI is:"+cuboid);
    }
}
