import java.util.List;
public class FolhaDePagamento{
    public double calcularTotal(List<Funcionario> funcionarios){
        if(funcionarios == null|| funcionarios.isEmpty()){
            return 0;
        }
        double total = 0;
        for(Funcionario f : funcionarios){
            if ( f != null ){
                total += f.calcularPagamento();
            }
        }
        return total;
    }
}