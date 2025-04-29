import controller.ProfessorController;
import model.Professor;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProfessorController professorController =  new ProfessorController();
        Professor p = new Professor();

        System.out.println("Digite o nome do professor");
        p.setNome(scanner.next());
        System.out.println("Digite a idade do professor");
        p.setIdade(scanner.nextInt());
        System.out.println("Digite a especialização do professor");
        p.setEspecializacao(scanner.next());

        professorController.cadastrarProfessor(p);
        professorController.listarProfessores();

        System.out.println("Digite o nome do professor a ser atualizado: ");
        String nomeAntigo = scanner.next();
        System.out.println("Digite o nome novo do professor");
        String novoNome = scanner.next();

        professorController.atualizarProfessor(nomeAntigo,novoNome);


        System.out.println("Digite o nome do professor a ser deletado: ");
        String nomeDeletar = scanner.next();
        professorController.deletarProfessor(nomeDeletar);


    }
}