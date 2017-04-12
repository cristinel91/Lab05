package it.polito.tdp.angrammi.model;
import java.util.*;

public class Parola {
	
	private List<Character>caratteri;
	
	public List<Character> getListaCaratteri(String parola){
		for(int i=0; i<parola.length();i++)
			caratteri.add(parola.charAt(i));
		return caratteri;
	}
	
	public int getLength(){
		return caratteri.size();
	}
}
