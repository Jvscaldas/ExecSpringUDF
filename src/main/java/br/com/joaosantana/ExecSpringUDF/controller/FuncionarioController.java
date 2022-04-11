package br.com.joaosantana.ExecSpringUDF.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.joaosantana.ExecSpringUDF.model.Funcionario;
import br.com.joaosantana.ExecSpringUDF.persistence.FuncionarioDao;

@Controller
public class FuncionarioController {

	@Autowired
	FuncionarioDao fDao;

	@RequestMapping(name = "funcionario", value = "/funcionario", method = RequestMethod.POST)
	public ModelAndView init(ModelMap model, @RequestParam Map<String, String> allParam) {
		String erro = "";
		String botao = allParam.get("botao");
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();

		try {
			if (botao.equals("Funcionario")) {
				funcionarios = fDao.findFuncionarios();
			} else {
				erro = "Preencha os campos corretamente!";
			}
		} catch (ClassNotFoundException | SQLException e) {
			erro = e.getMessage();
		} finally {
			model.addAttribute("erro", erro);
			model.addAttribute("funcionarios", funcionarios);
		}
		return new ModelAndView("funcionario");
	}
}
