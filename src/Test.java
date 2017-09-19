import java.util.List;

import articles.*;

public class Test {
	public static void testArticlesTri(){
		List<Article> lstArticles = Application.articles;
		List<Article> lstArticleTrie = Application.tri("reference");
		System.out.println("============================");
		System.out.println("Tri par référence");
		System.out.println("============================");
		for(Article a : lstArticleTrie){
			System.out.println(a.getReference());
		}
		
		lstArticleTrie = Application.tri("marque");
		System.out.println("============================");
		System.out.println("Tri par marque");
		System.out.println("============================");
		for(Article a : lstArticleTrie){
			System.out.println(a.getMarque());
		}
		
		lstArticleTrie = Application.tri("modele");
		System.out.println("============================");
		System.out.println("Tri par modele");
		System.out.println("============================");
		for(Article a : lstArticleTrie){
			System.out.println(a.getModele());
		}
		
		lstArticleTrie = Application.tri("prix");
		System.out.println("============================");
		System.out.println("Tri par prix");
		System.out.println("============================");
		for(Article a : lstArticleTrie){
			System.out.println(a.getPrixLocation());
		}
	}
}
