import java.util.List;
import java.util.ArrayList;
public class Pasta extends NodeSistema{
    private List <NodeSistema> filhos;
    public Pasta(String nome) throws DadoInvalidoException{
        super(nome);
        this.filhos = new ArrayList<>();
    }
    public void adicionar(NodeSistema n) throws DadoInvalidoException{
        if( n == null){
            throw new DadoInvalidoException("Não é possível adcionar um valor nulo");
        }
        for(NodeSistema filho : filhos){
            if(filho.getNome().equalsIgnoreCase(n.getNome())){
                throw new DadoInvalidoException("Já existe um arquivo com esse nome");
            }
        }
        filhos.add(n);
    }
    @Override 
    public long getTamanho(){
        long total = 0;
        for(NodeSistema filho : filhos){
            total += filho.getTamanho();
        }
        return total;
    }
}