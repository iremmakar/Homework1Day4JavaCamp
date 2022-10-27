package Kodlama.io.Devs.dataAccess.concretes;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;


@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{
	
	
	
	
	
	public InMemoryProgrammingLanguageRepository() {
		
		
	}



	@Override
	public List<ProgrammingLanguage> getAll(List<ProgrammingLanguage> programmingLanguages) {
		
		return programmingLanguages;
	}

	

	@Override
	public List<ProgrammingLanguage> delete(ProgrammingLanguage programmingLanguage,List<ProgrammingLanguage> programmingLanguages) {
		programmingLanguages.remove(programmingLanguage.getId());
		
		return programmingLanguages;
	}

	@Override
	public List<ProgrammingLanguage> update(int index,String name,List<ProgrammingLanguage> programmingLanguages) {
		programmingLanguages.set(index, new ProgrammingLanguage(name,index+1));
		return programmingLanguages;
	}



	@Override
	public List<ProgrammingLanguage> add(ProgrammingLanguage programmingLanguage,List<ProgrammingLanguage> programmingLanguages) {
		programmingLanguages.add(programmingLanguage);
		return programmingLanguages;
	}
	

}
