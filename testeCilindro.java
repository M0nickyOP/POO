import java.util.Scanner;
public class testeCilindro
{
    public static void main(String[]args){
    
    Cilindro c1 = new Cilindro(1,1);
    Cilindro c2 = new Cilindro(2,5);
    Cilindro c3 = new Cilindro(3.5, 10);
    
    Scanner input = new Scanner(System.in);
    System.out.println("insira o raio do cilindro");
    double r;
    r = input.nextDouble();
    System.out.println("insira a altura do cilindro");
    double h;
    h = input.nextDouble();
    
    Cilindro c4 = new Cilindro(r,h);
    input.close();
    
    System.out.println(c1.toString());
    System.out.println(c2.toString());
    System.out.println(c3.toString());
    System.out.println(c4.toString());
    }
}
