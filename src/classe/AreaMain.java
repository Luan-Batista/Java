package classe;


import java.util.Scanner;

public class AreaMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raioInic = scan.nextDouble();
        AreaCirc area1 = new AreaCirc(raioInic);
        System.out.println(area1.area());
        System.out.println(AreaCirc.pi);
    }
}
