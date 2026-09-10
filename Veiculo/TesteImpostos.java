import java.util.ArrayList;
import java.util.List;
public class TesteImpostos{
    public static void main(String[]args){
        try{
            Veiculo carro = new Carro("Kwid", 10000);
            Veiculo caminhao = new Caminhao("Toyota",70000);
            Veiculo moto = new Moto("Ducatti",50000);
            
            List<Tributavel> lista = new ArrayList<>();
            lista.add(carro);
            lista.add(caminhao);
            lista.add(moto);
            lista.add(null);
            
            SistemaImpostos sistema = new SistemaImpostos();
            double total = sistema.somarImpostos(lista);
            
            System.out.println("Total de impostos: R$ " + total);
            
            try{
                Veiculo invalido = new Carro ("ferrari", 10000);
            }catch (DadoInvalidoException e){
                System.out.println("Erro ao criar o veículo: " + e.getMessage());
            }
        }catch(DadoInvalidoException e){
            System.out.println("ERRO: " + e.getMessage());
        }finally{
            System.out.println("Encerrando sistema...");
        }
    }
}