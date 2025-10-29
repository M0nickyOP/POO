public class Ponto{
    double x;
    double y;
     
    Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }
    Ponto(){
        this(0,0);
    }
    Ponto(Ponto p){
        this(p.x, p.y);
    }
    double distancia(Ponto p){
        return Math.sqrt(Math.pow(p.x - x,2) + Math.pow(p.y - x,2));
    }
}
