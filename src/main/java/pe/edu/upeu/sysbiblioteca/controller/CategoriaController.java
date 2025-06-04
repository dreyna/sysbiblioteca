package pe.edu.upeu.sysbiblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import pe.edu.upeu.sysbiblioteca.service.CategoriaService;
import pe.edu.upeu.sysbiblioteca.service.ICategoriaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CategoriaController {
	@Autowired
	private CategoriaService categoriaService;
	
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("cats", categoriaService.readAll());
		return "index";
	}

}
