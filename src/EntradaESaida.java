    import java.util.Scanner;

public class EntradaESaida {

    public static void main(String[] args) {
        //ler as notas dos alunos e calcular a média FIAP
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite o nome do aluno: ");
        String nome = leitor.nextLine();

        //declarar variaveis necessarias
        System.out.println("digite a nota do primeiro check point: ");
        double cp1 = leitor.nextDouble();
        System.out.println("digite a nota do segundo check point: ");
        double cp2 = leitor.nextDouble();
        System.out.println("digite a nota do global solution: ");
        double gs = leitor.nextDouble();
        System.out.println("digite a nota do primeiro chalenge: ");
        double ch1 = leitor.nextDouble();
        System.out.println("digite a nota do segundo chalenge:");
        double ch2 = leitor.nextDouble();

        //calculando a média semestral
        double cpfinal = cp1 += cp2 /= 2;
        System.out.println("média semestral do aluno " + nome + " é: " + cpfinal);
    }

}
