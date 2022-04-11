package br.com.joaosantana.ExecSpringUDF.persistence;

import java.sql.SQLException;
import java.util.List;

import br.com.joaosantana.ExecSpringUDF.model.Funcionario;

public interface IFuncionarioDao {

	public List<Funcionario> findFuncionarios() throws SQLException, ClassNotFoundException;

}
