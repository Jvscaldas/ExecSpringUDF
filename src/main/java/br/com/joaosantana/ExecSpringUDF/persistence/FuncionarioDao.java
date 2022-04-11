package br.com.joaosantana.ExecSpringUDF.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.joaosantana.ExecSpringUDF.model.Funcionario;

@Repository
public class FuncionarioDao implements IFuncionarioDao {

	@Autowired
	GenericDao gDao;

	@Override
	public List<Funcionario> findFuncionarios() throws SQLException, ClassNotFoundException {
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();

		Connection c = gDao.getConnection();
		String sql = "SELECT nome_funcionario, nome_dependente, salario_funcionario, salario_dependente FROM fn_tablefunc()";
		PreparedStatement ps = c.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Funcionario f = new Funcionario();
			f.setNome_funcionario(rs.getString("nome_funcionario"));
			f.setNome_dependente(rs.getString("nome_dependente"));
			f.setSalario_funcionario(rs.getFloat("salario_funcionario"));
			f.setSalario_dependente(rs.getFloat("salario_dependente"));

			funcionarios.add(f);
		}

		rs.close();
		ps.close();
		c.close();

		return funcionarios;
	}

}
