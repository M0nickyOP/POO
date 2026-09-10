public class Caminhao extends Veiculo{
    public Caminhao(String modelo, double precoBase) throws DadoInvalidoException{
        super(modelo, precoBase);
    }
    @Override 
    public double calcularImposto(){
        if(getPrecoBase() > 200000){
            return getPrecoBase() * 0.10;
        }else{
            return getPrecoBase() * 0.08;
        }
    }
}