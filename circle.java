public class Circulo
{
    double raio;
    Circulo(double raio) {
        this.raio = raio;
    }
    
    double area(){
        return Math.PI  * this.raio * this.raio;
    }
    double perimetro() {
        return Math.PI * 2 * this.raio;
    }
    public static void main (String[]args){
        Circulo c1 = new Circulo(3);
        System.out.println(c1.area());
        
        Circulo c2 = new Circulo(5);
        System.out.println(c2.area());
        c2.raio = 10;
         System.out.println(c2.area());
    }
}
