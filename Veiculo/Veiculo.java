public abstract class Veiculo implements Tributavel{
    private String modelo;
    private double precoBase;
    
    public Veiculo(String modelo, double precoBase) throws DadoInvalidoException{
        setModelo(modelo);
        setPrecoBase(precoBase);
    }
    private void setModelo(String modelo) throws DadoInvalidoException{
        if(modelo == null || modelo.trim().isEmpty()){
            throw new DadoInvalidoException("Modelo Inválido");
        }
        this.modelo = modelo;
    }
    private void setPrecoBase(double precoBase) throws DadoInvalidoException{
        if(precoBase <= 0){
            throw new DadoInvalidoException("Preço base deve ser maior que zero!");
        }
        this.precoBase = precoBase;
    }
    public String getModelo(){
        return modelo;
    }
    public double getPrecoBase(){
        return precoBase;
    }
    @Override
    public abstract double calcularImposto();
}
