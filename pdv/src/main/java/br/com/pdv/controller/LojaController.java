package br.com.pdv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LojaController {

	@GetMapping({"/lojas"}) //é o nome que eu quiser colocar
    public String listarEnderecos(ModelMap model) { 			
   
		 return "lojas"; //é o nome do arquivo real	
    	    	
    }
}
