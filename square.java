public class quadrado
{
    double lado;
    quadrado(double lado){
        this.lado = lado;
    }
    double area(){
        return Math.pow(this.lado,2); 
    }
    double perimetro(){
        return 4 * lado;
    }
    public static void main(String[]args){
        quadrado l1 = new quadrado(3);
        quadrado l2 = new quadrado(4);
        quadrado l3 = new quadrado(5);
        System.out.println(" a area do quadrado 1 é " + l1.area());
        System.out.println("o perimetro do quadrado 1 é " + l1.perimetro());
        System.out.println(" a area do quadrado 2 é "+ l2.area());
        System.out.println("o perimetro do quadrado 2 é " + l3.perimetro());
        System.out.println(" a area do quadrado 3 é " + l3.area());
        System.out.println("o perimetro do quadrado 3 é " + l3.perimetro()); 
    }
}
