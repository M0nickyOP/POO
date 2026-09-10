public abstract class NodeSistema{
    private String nome;
    public NodeSistema(String nome) throws DadoInvalidoException{
        setNome(nome);
    }
    private void setNome(String nome) throws DadoInvalidoException{
        if(nome == null || nome.trim().isEmpty()){
            throw new DadoInvalidoException("Nome Inválido");
        }
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public abstract long getTamanho();
}