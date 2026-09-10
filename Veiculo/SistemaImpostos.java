import java.util.List;
public class SistemaImpostos{
    public double somarImpostos(List<Tributavel> itens){
        if(itens == null || itens.isEmpty()){
            return 0;
        }
        double total = 0;
        for(Tributavel t : itens){
        if( t != null){
            total += t.calcularImposto();
            }
        }
        return total;
        
    }
}