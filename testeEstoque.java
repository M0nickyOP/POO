public class testeEstoque 
{
   public static void main(String[]args){
        Estoque q1 = new Estoque("Impressora Jato de Tinta", 13,6);
        Estoque q2 = new Estoque("Monitor LCD 17 polegadas", 11, 13);
        Estoque q3 = new Estoque ("Mouse Óptico", 6, 2);
        q1.darBaixa(5);
        q2.repor(7);
        q3.darBaixa(4);
         System.out.printf(" %s precisa repor %b\n", q1.nome,q1.precisaRepor());
         System.out.printf("%s precisa repor %b\n", q2.nome, 
                        q2.precisaRepor());
        System.out.printf("%s precisa repor %b\n", q3.nome, 
                        q3.precisaRepor());
        System.out.println(q1.descricao());
        System.out.println(q2.descricao());
        System.out.println(q3.descricao());
    }
}
