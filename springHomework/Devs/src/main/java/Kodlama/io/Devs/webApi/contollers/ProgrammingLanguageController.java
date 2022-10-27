package Kodlama.io.Devs.webApi.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programmingLanguage")
public class ProgrammingLanguageController {
	ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
		super();
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@GetMapping("/getAll")
	public List<ProgrammingLanguage> getAll(){
		return programmingLanguageService.getAll();
	}
	
	@GetMapping("/add")
	public List<ProgrammingLanguage> add(ProgrammingLanguage programmingLanguage) throws Exception{
		return programmingLanguageService.add(programmingLanguage);
	}
	
	@GetMapping("/delete")
	public List<ProgrammingLanguage> delete(ProgrammingLanguage programmingLanguage){
		return programmingLanguageService.delete(programmingLanguage);
	}
	
	
	@GetMapping("/update")
	public List<ProgrammingLanguage> update(int index,String name){
		return programmingLanguageService.update(index,name);
	}
	

}
