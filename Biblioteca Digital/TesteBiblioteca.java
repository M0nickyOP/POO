public class TesteBiblioteca{
    public static void main(String[]args){
        Biblioteca biblioteca = new Biblioteca();
        
        try{
            LivroDigital livro = new LivroDigital("Java Basico", 5.2, "Jose Silva");
            VideoDigital video = new VideoDigital("Curso Java", 700, 120);
            AudioDigital audio = new AudioDigital("Podcast Java", 50, 128);
            
            biblioteca.adicionar(livro);
            biblioteca.adicionar(video);
            biblioteca.adicionar(audio);
            
            System.out.println("Busca por prefixo 'Java': ");
            for(ItemDigital item : biblioteca.buscaPorPrefixo("Java")){
                System.out.println(item.getDescricao());
            }
            System.out.println("\nRelatório da Biblioteca: ");
            System.out.println(biblioteca.gerarRelatorio());
            
            LivroDigital livroDuplicado = new LivroDigital("Java Básico", 6.0, "Maria Silva");
            biblioteca.adicionar(livroDuplicado);
        }catch(ItemInvalidoException e){
            System.out.println("Erro: "+ e.getMessage());
        }
    }
}