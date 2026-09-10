import java.util.List;
import java.util.ArrayList;
public class TestePagamentos{
    public static void main(String [] args ){
        try {
            Funcionario f1 = new FuncionarioAssalariado("Remi", "444", 5000);
            Funcionario f2 = new FuncionarioComissionado("Lena", "123", 2000, 0.1);
            Funcionario f3 = new FuncionarioHorista("Jasper", "244", 80, 160);
            
            List<Funcionario> lista = new ArrayList<>();
            lista.add(f1);
            lista.add(f2);
            lista.add(f3);
            lista.add(null);
            
            FolhaDePagamento folha =new FolhaDePagamento();
            double total = folha.calcularTotal(lista);
            System.out.println("O total da folha de pagamento é R$" + total);
            
            try {
                Funcionario invalido = new FuncionarioAssalariado("", "000", -1000);
            }catch(DadoInvalidoException e){
                System.out.println("Erro ao criar funcionario: " + e.getMessage());
            } 
        } catch (DadoInvalidoException e){
                System.out.println("Erro" + e.getMessage());
            }
        
    }
}