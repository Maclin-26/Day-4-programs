import java.util.Scanner;
public class Poly {
    public static void main(String[] args) {
        rectangle r=new rectangle();
        r.area(4,4);
        r.perimeter(5,4);
    }
}
class shape
{
    void area(int a, int b) {
        System.out.println("Area: ");
    }

    void Perimeter(int a, int b) {
        System.out.println("Perimeter:");
    }
}
class rectangle extends shape
    { void area(int a, int b){
            System.out.println(a*b);
        }
        void perimeter(int a,int b)
        {
            System.out.println(2*(a+b));
        }
    }