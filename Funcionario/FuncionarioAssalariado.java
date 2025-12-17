public class FuncionarioAssariado extends Funcionario{
    private double salario;
    
    public FuncionarioAssalariado(String nome, String documento, double salario) throws DadoInvalidoException{
        super(nome, documento);
        setSalarioMensal(salario);
    }
    private void setSalarioMensal(double salario) throws DadoInvalidoException{
        if(salario <= 0){
            throw new DadoInvalidoException("Salario Invalido");
        }
        @Override 
        public double calcularSalario(){
            return this.salario; 
        }
    }
}
