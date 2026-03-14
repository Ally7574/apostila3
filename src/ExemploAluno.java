public class ExemploAluno {

    public static void main(String[] args) {
        //criar um objeto do tipo aluno
        Aluno estudante = new Aluno();
        estudante.id = 571046;
        estudante.matriculado = true;
        estudante.curso = "ADS";
        estudante.idade = 18;
        estudante.NomeDoAluno = "Allyson Victor";
        estudante.Mensalidade = 1300;
        estudante.turma = 'V';

        //exibir os valores dos atributos do objeto aluno
        System.out.println("Nome: " + estudante.NomeDoAluno);
        System.out.println("id: " + estudante.id);
        System.out.println("idade:" + estudante.idade);
        System.out.println("curso: " + estudante.curso);
        System.out.println("matricula: " + estudante.matriculado);
        System.out.println("turma: " + estudante.turma);
        System.out.println("Mensalidade: " + estudante.Mensalidade);

        //criar outro objeto aluno
        Aluno estudante2 = new Aluno();
        estudante2.id = 213672;
        estudante2.matriculado = true;
        estudante2.curso = "ADS";
        estudante2.idade = 25;
        estudante2.NomeDoAluno = "José";
        estudante2.Mensalidade = 1300;
        estudante2.turma = 'V';

        //exibir os valores do segundo aluno
        System.out.println("-------------------------------------");
        System.out.println("Nome: " + estudante2.NomeDoAluno);
        System.out.println("id: " + estudante2.id);
        System.out.println("idade: " + estudante2.idade);
        System.out.println("curso: " + estudante2.curso);
        System.out.println("matricula: " + estudante2.matriculado);
        System.out.println("turma: " + estudante2.turma);
        System.out.println("mensalidade: " + estudante2.Mensalidade);

    }

}
