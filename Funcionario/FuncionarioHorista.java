public class FuncionarioHorista{
    private double valorHora;
    private double horasTrabalhadas;
    
    public FuncionarioHorista(double valorHora, double horasTrabalhadas) throws DadoInvalidoException {
        super(nome, documento);
        setValorHora(valorHora);
        sethorasTrabalhadas(horasTrabalhadas);
    }
    private void setValorHora(double valorHora) throws DadoInvalidoException {
        if(valorHora <= 0){
            throws DadoInvalidoException("Nenhum valor registrado");
        }
        this.valorHora = valorHora;
    }
    private void sethorasTrabalhadas(double horasTrabalhadas)throws DadoInvalidoException{
        if(horasTrabalhadas < 0){
            throws DadoInvalidoException("Nenhuma hora trabalhada registrada");
        }
        this.horasTrabalhadas = horasTrabalhadas;
    }
    @Override 
    public double CalcularPagamento(){
        return this.valorHora * this.horasTrabalhadas;
    }
}
