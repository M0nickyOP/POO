public class FuncionarioHorista extends Funcionario{
    private double valorHora;
    private double  horasTrabalhadas;
    
    public FuncionarioHorista (String nome, String documento, double valorHora, double horasTrabalhadas) throws DadoInvalidoException{
        super(nome, documento);
        setValorHora(valorHora);
        setHorasTrabalhadas(horasTrabalhadas);
    }
    private void setValorHora(double valorHora)throws DadoInvalidoException{
        if(valorHora <= 0){
            throw new DadoInvalidoException ("O valor da hora não pode ser negativa!");
        }
        this.valorHora = valorHora;
    }
    private void setHorasTrabalhadas(double horasTrabalhadas) throws DadoInvalidoException {
        if (horasTrabalhadas < 0){
            throw new DadoInvalidoException("A hora deve ser maior que 0!");
        }
    }
    
    @Override   
    public double calcularPagamento(){
        return valorHora * horasTrabalhadas;
    }
}