package br.com.pdv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pdv.repository.LojaRepository;

@Controller
public class LojaController {
	
	@Autowired
	private LojaRepository lojaRepository;

	@GetMapping({"/lojas"}) //é o nome que eu quiser colocar
    public String home(ModelMap model) { 	
		
		
         model.addAttribute("lojas", lojaRepository.findAll());
		 return "lojas"; //é o nome do arquivo real	
    	    	
    }
}
