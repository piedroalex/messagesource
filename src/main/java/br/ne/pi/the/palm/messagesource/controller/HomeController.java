package br.ne.pi.the.palm.messagesource.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.ne.pi.the.palm.messagesource.enuns.Sentence;

/**
 * Controller da página home 
 * @author Pedro Alex
 */
@Controller
public class HomeController {

    @Autowired
    private MessageSource messageSource;

    /** Retorna a págima Home com as sentenças adicionadas */
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("sentences", allSentences());
		return "Home";
	}

	/** Cria uma lista de sentenças com o page.content do message.properties */
	private List<String> allSentences(){
		List<String> sentences = new ArrayList<String>();
		for(Sentence s: sentences()) {
			sentences.add(messageSource.getMessage("page.content", new Object[] { s.getDescription() }, Locale.US));
		}
		return sentences;
	}
	
	/** Retorna os valores do enum Sentence */
	private List<Sentence> sentences(){
		return Arrays.asList(Sentence.values());
	}
}
