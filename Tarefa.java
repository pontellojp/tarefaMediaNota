public class Tarefa {

    public static void main(String args[]){

        notaAluno2();
        notaAluno1();

    }
    public static void notaAluno1() {
        System.out.println("***** notaAluno1 *****");
        int nota1 = 20;
        int nota2 = 17;
        int nota3 = 19;
        int nota4 = 24;

        int somaNotas = nota1 + nota2 + nota3 + nota4;
        System.out.println("Soma das Notas Aluno1: " + somaNotas);

        int media = somaNotas / 4;
        System.out.println("Media Aluno1: " + media + "\n");

    }

    public static void notaAluno2() {
        System.out.println("***** notaAluno2 *****");
        int nota1 = 11;
        int nota2 = 13;
        int nota3 = 25;
        int nota4 = 22;

        int somaNotas = nota1 + nota2 + nota3 + nota4;
        System.out.println("Soma das Notas Aluno2: " + somaNotas);

        int media = somaNotas / 4;
        System.out.println("Media Aluno2: " + media);
        System.out.println("\n");

    }
}