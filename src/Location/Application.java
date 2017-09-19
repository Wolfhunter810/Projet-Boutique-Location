package Location;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import articles.*;

public class Application {
	public ArrayList<Article> articles;
	
	public static void main(String[] args){
		
	}
	
	public ArrayList<Article> tri(String modeTri){
		ArrayList<Article> articlesTrie = new ArrayList<Article>();
		switch(modeTri){
		case "reference":
			Collections.sort(this.articles, getCompByRef());
			return this.articles;
		case "marque":
			Collections.sort(this.articles, getCompByMarque());
			return this.articles;
		case "modele":
			return this.articles;
		case "prix-":
			return this.articles;
		case "prix+":
			return this.articles;
		}
	}
	
	public static Comparator<Article> getCompByRef(){   
		Comparator<Article> comparator = new Comparator<Article>(){
			public int compare(Article o1, Article o2) {
				return o1.getReference().compareTo(o2.getReference());
			}        
		};
		return comparator;
	}
	
	public static Comparator<Article> getCompByMarque(){   
		Comparator<Article> comparator = new Comparator<Article>(){
			public int compare(Article o1, Article o2) {
				return o1.getMarque().compareTo(o2.getMarque());
			}        
		};
		return comparator;
	}  
}
