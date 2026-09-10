public class FuncionarioAssalariado extends Funcionario{
    private double salarioMensal;
    
    public FuncionarioAssalariado(String nome, String documento, double salarioMensal) throws DadoInvalidoException{
    super(nome,documento);
    setSalarioMensal(salarioMensal);
    }
    private void setSalarioMensal(double salarioMensal) throws DadoInvalidoException{
        if (salarioMensal <= 0){
            throw new DadoInvalidoException("Salario mensal deve ser maior que zero");
        }
        this.salarioMensal = salarioMensal;
    }
    @Override 
    public double calcularPagamento(){
        return salarioMensal;
    }
}