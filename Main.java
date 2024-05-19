import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    
    
    public static void main(String[] args) {
        
        ArrayList <Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
        Scanner sc = new Scanner(System.in);
        FuncionarioView view = new FuncionarioConsoleView();


        boolean rodando = true;
        
        while (rodando) {
            
            System.out.println("[1] Cadastrar Funcionario.");
            System.out.println("[2] Ver a lista de Funcionarios.");
            System.out.println("[3] Excluir Funcionario.");
            System.out.println("[4] Sair.");
            
            int op = sc.nextInt();
            
            switch (op) {
                case 1:
                view.ClearScreen();
                System.out.println("___________________________________________________");
                System.out.print("Digite o nome do Funcionario: ");
                String nome = view.getUserInput();
                System.out.print("Digite o usuario: ");
                String usuario = view.getUserInput();
                System.out.print("DIgite a senha: ");
                String senha = view.getUserInput();
                Funcionario novoFuncionario = new Funcionario(nome, usuario, senha);

                new FuncionarioDAO().cadastrarFuncionario(novoFuncionario);
                
            
                listaFuncionarios.add(novoFuncionario);
                
                break;

            case 2:
                view.ClearScreen();
                System.out.println("___________________________________________________");
                System.out.println("++++++++++Lista dos FUNCIONARIOS+++++++++");
                    for (Funcionario funcionario : listaFuncionarios) {
                    System.out.printf("Usuario: %d Nome: %s\n\tUsuario: %s\n\tSenha: %s\n", funcionario.getNumeroFuncionario(), funcionario.getNome(), funcionario.getUsuario(), funcionario.getSenha());
                }

                break;

            case 3:
                System.out.println("___________________________________________________");
                System.out.print("Digite o nome do funcionario para excluir: ");
                String temp = view.getUserInput();

                for (Funcionario f : listaFuncionarios) {
                    if (f.getNome().equals(temp)) {
                        int removerFuncionario = f.getNumeroFuncionario();
                        new FuncionarioDAO().removerFuncionario(removerFuncionario);
                        System.out.println("Usuario apagado.");
                        break;
                        
                    } else {
                        System.out.println("Usuario não encontrado.");
                    }
                }

                break;

            case 4:
                rodando = false;
        
            default:
                break;
        }

    }
    sc.close();
}

}