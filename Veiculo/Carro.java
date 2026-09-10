public class Carro extends Veiculo{
    public Carro(String modelo, double precoBase)throws DadoInvalidoException{
        super(modelo, precoBase);
    }
    @Override 
    public double calcularImposto(){
        return getPrecoBase() * 0.05;
    }
}