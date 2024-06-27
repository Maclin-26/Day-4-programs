import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        test sum=new test();
        System.out.println(sum.add(a,b));
        System.out.println(sum.sub(a,b));
    }
}
class test{
    int add(int a, int b){
        return a+b;
    }
    int sub(int a, int b){
        return a-b;
    }
}