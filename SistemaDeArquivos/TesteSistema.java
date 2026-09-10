public class TesteSistema{
    public static void main(String []args){
        try{
            Pasta raiz = new Pasta ("Documentos");
            Arquivo a1 = new Arquivo ("foto.png", 500);
            Arquivo a2 = new Arquivo ("texto.txt", 200);
            Pasta subPasta = new Pasta ("Projetos");
            Arquivo a3 = new Arquivo ("codigo.java", 1000);
            
            raiz.adicionar(a1);
            raiz.adicionar(a2);
            raiz.adicionar(subPasta);
            subPasta.adicionar(a3);
            System.out.println("Tamanho da pasta raiz: "+ raiz.getTamanho() + " bytes");
        Arquivo duplicado = new Arquivo("foto.png",500);
        raiz.adicionar(duplicado);
        }catch(DadoInvalidoException e){
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}