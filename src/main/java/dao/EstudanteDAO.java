package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Estudante;

/**
 *
 * @author
 */
public class EstudanteDAO implements IEstudante, IConst {
    private String sql;
    private Connection conn;
    private PreparedStatement stmt;

    private ResultSet result;

    private void open() throws SQLException {
        conn = Conexao.getConexao(Conexao.stringDeConexao, Conexao.usuario, Conexao.senha);
    }

    private void close() throws SQLException {
        conn.close();
    }

    public void inserir(Estudante estudante) throws SQLException {
        open();
        sql = "INSERT INTO estudante (nome) VALUES (?)";
        stmt = this.conn.prepareStatement(sql);
        stmt.setString(1, estudante.getNome());
        stmt.executeUpdate();
        close();
    }

    public void excluir(Estudante estudante) throws SQLException {
        open();
        sql = "DELETE FROM Estudante WHERE estudante.nome = ?";
        stmt = this.conn.prepareStatement(sql);
        stmt.setString(1, estudante.getNome());
        stmt.executeUpdate();
        close();
    }

    public void alterar(Estudante estudante, String novoNome) throws SQLException {
        open();
        int id = procuraUsuarioPorNome(estudante);
        sql = "update estudante set nome = ? where estudanteid = ?";
        stmt = this.conn.prepareStatement(sql);
        stmt.setString(1, novoNome);
        stmt.setInt(2, id);
        stmt.executeUpdate();
        close();
    }

    public int procuraUsuarioPorNome(Estudante estudante) throws SQLException {
        int id = 0;
        open();
        sql = "SELECT * FROM estudante WHERE nome ~* ?";
        stmt = this.conn.prepareStatement(sql);
        stmt.setString(1, estudante.getNome());
        stmt.executeQuery();
        result = stmt.getResultSet();
        while(result.next()) {
            id = result.getInt("estudanteID");
        }
        return id;

    }
}
