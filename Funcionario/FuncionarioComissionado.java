public class FuncionarioComissionado extends Funcionario{
    private double vendasBrutas;
    private double percentualComissao;
    
    public FuncionarioComissionado (String nome, String documento, double vendasBrutas, double percentualComissao) throws DadoInvalidoException {
        super(nome, documento);
        setVendasBrutas(vendasBrutas);
        setPercentualComissao(percentualComissao);
    }
    private void setVendasBrutas(double vendasBrutas) throws DadoInvalidoException{
        if( vendasBrutas < 0 ){
            throw new DadoInvalidoException("O numero de vendas deve ser maior que zero!");
        }
        this.vendasBrutas = vendasBrutas;
    }
    private void setPercentualComissao(double percentualComissao) throws DadoInvalidoException{
        if(percentualComissao <= 0 || percentualComissao > 1){
            throw new DadoInvalidoException("Percentual de comissão deve estar entre 0 e 1");
        }
        this.percentualComissao = percentualComissao;
    }
    @Override 
    public double calcularPagamento(){  
        return vendasBrutas * percentualComissao;
    }
}