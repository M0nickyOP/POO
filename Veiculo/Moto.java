public class Moto extends Veiculo{
    public Moto(String modelo, double precoBase) throws DadoInvalidoException{
            super(modelo, precoBase);
    }
    @Override 
    public double calcularImposto(){
        return getPrecoBase() * 0.03;
    }
}