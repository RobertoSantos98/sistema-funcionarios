public class FuncionarioController {
    
    public boolean cadastrarFuncionario(String nome, String usuario, String senha){
        
        if(nome != null && nome.length() > 0 && usuario!= null && usuario.length()>0 && senha != null && senha.length()>0){
            Funcionario novoFuncionario = new Funcionario(nome, usuario, senha);
            novoFuncionario.cadastrarFuncionario(novoFuncionario);
            return true;
        }

        return false;
        
    }
}
