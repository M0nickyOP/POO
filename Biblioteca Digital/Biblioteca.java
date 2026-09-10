import java.util.ArrayList;
import java.util.List;
public class Biblioteca{
    private List<ItemDigital> itens;
    
    public Biblioteca(){
        itens = new ArrayList<>();
    }
    public void adicionar(ItemDigital item){
        if(item == null){
            throw new ItemInvalidoException("Item não pode ser nulo");
        }
        
        for(ItemDigital existente : itens){
            if (existente.getTitulo().equalsIgnoreCase(item.getTitulo().trim())){
                throw new ItemInvalidoException("Titulo duplicado: " + item.getTitulo());
            }
        }
        itens.add(item);
        }
        public List <ItemDigital> buscaPorPrefixo(String prefixo){
            List<ItemDigital> resultado = new ArrayList <>();
            if(prefixo == null || prefixo.trim().isEmpty()){
                return resultado;
            }
            String prefixoNormalizado = prefixo.trim().toLowerCase();
            for(ItemDigital item : itens){
                if(item.getTitulo().toLowerCase().startsWith(prefixoNormalizado)){
                    resultado.add(item);
                }
            }
        return resultado;
        }
        public String gerarRelatorio(){
            StringBuilder sb = new StringBuilder();
            for(ItemDigital item : itens){
                sb.append(item.getDescricao()).append("\n");
            }
            return sb.toString();
        }
    }
