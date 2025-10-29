import java.util.Scanner;
public class funcionario{
  String nome;
  int horasTrabalhadas;
  double valorHora;
   
        funcionario (String nome,int horasTrabalhadas,double valorHora){
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        }
        funcionario() {
            this("João",20,3.50);
        }
        double calcularSalario() {
            return this.horasTrabalhadas * this.valorHora;
        }
        public String toString () {
              return "o funcionario" + this.nome + "trabalhou" + this.horasTrabalhadas + " e recebe" + this.valorHora + "logo, seu salario é" +  calcularSalario();
        }
        
        public static void main(String[]args) {
        funcionario Mateus = new funcionario("Mateus", 40, 5.50);
        funcionario Lucas = new funcionario("Lucas", 40, 13.50);
        
        Scanner CLT = new Scanner(System.in);
        System.out.println("Insira o nome de um funcionario");
        String n;
        n = CLT.nextLine();
        System.out.println("Quantas horas esse funcionario trabalhou");
        int h;
        h = CLT.nextInt();
        System.out.println("qual valor ele ganha por hora?");
        double vh;
        vh = CLT.nextDouble();
        CLT.nextLine();
        
        funcionario empregado = new funcionario(n, h, vh);
        
        System.out.println(empregado.toString());
        }
        
    }
    

