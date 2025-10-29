import java.util.Scanner;
public class alunoTeste
{
   
    public static void main(String[]args){
        Scanner Estudante = new Scanner(System.in);
        
        System.out.print("digite a matricula do aluno: ");
        int m;
        m = Estudante.nextInt();
        Estudante.nextLine();
        
        System.out.print("digite o nome do aluno: ");
        String n; 
        n = Estudante.nextLine();
        
        System.out.print("digite a primeira nota: ");
        float n1;
        n1 = Estudante.nextFloat();
        
        System.out.print("digite a segunda nota: ");
        float n2;
        n2 = Estudante.nextFloat();
        
        System.out.print("digite a nota do trabalho: ");
        float t;
        t = Estudante.nextFloat();
        
        aluno estudante = new aluno(m ,n, n1, n2, t);
        Estudante.close();
         System.out.println(estudante.toString());
    }
   
    
}
