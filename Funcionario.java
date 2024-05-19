

public class Funcionario {

    private static int id = 1;

    private int numeroFuncionario;
    private String nome;
    private String usuario;
    private String senha;

    public Funcionario(String nome, String usuario, String senha){
        this.numeroFuncionario = id;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        Funcionario.id += 1;
    }

    
    public int getNumeroFuncionario() {
        return numeroFuncionario;
    }


    public void setNumeroFuncionario(int numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        Funcionario.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void cadastrarFuncionario(Funcionario funcionario){

    }

    

    
}