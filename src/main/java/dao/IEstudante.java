package dao;

import java.sql.SQLException;
import model.Estudante;

public interface IEstudante {
    public void inserir(Estudante estudante) throws SQLException;

}
