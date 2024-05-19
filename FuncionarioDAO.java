import java.sql.PreparedStatement;
import java.sql.SQLException;

import DAO.Conexao;

public class FuncionarioDAO {
    
    public void cadastrarFuncionario(Funcionario novoFuncionario){

        String sql = "INSERT INTO funcionarios(codigo, nome, usuario, senha) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = null;
        
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, novoFuncionario.getNumeroFuncionario());
            ps.setString(2, novoFuncionario.getNome());
            ps.setString(3, novoFuncionario.getUsuario());
            ps.setString(4, novoFuncionario.getSenha());

            ps.execute();
            ps.close();
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

    public void removerFuncionario(int removerFuncionario){

        String sql = "DELETE FROM funcionarios WHERE codigo = ?";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, removerFuncionario);

            ps.execute();
            ps.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
