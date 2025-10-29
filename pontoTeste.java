public class pontoTeste
{
    public static void main(String[]args) {
        Ponto p1 = new Ponto(3, 7);
        Ponto p2 = new Ponto(2, -5);
        
        System.out.printf("a distancia entre os pontos é %.2f\n", p1.distancia(p2));
        System.out.printf("a distancia entre os pontos é %.2f\n",  p2.distancia(p2));
        System.out.printf("a distancia entre os pontos é %.2f\n", p1.distancia(p1));
    }
   
}
