public class Cilindro
{
    double raio;
    double altura;
    
    Cilindro(double raio, double altura){
    this.raio = raio;
    this.altura = altura;
    }
    
    public double volume(){
    return 3.14 * this.raio * this.raio * this.altura;
    }
    public double areaLateral(){
    return 2 * 3.14 * this.raio * this.altura;
    }
    public double areaTotal(){
    return 2*(2 * 3.14 * this.raio) + areaLateral();
    }
    public String toString(){
    return String.format("a area lateral é %.2f, a area total e %.2f e o volume e %.2f", areaLateral(), areaTotal(), volume());
    }
}

