package io.datajek.spring.basics.movierecommendersystem.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
	
	private Filter filter;
	
	// Constructor Injection
	@Autowired
	public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
	    this.filter = filter;
	    System.out.println("Constructor invoked...");
	}
	

	public String[] recommendMovies(String movie) {
		System.out.println("Name of the filter in use: " + filter);
		String[] results = this.filter.getRecommendations(movie);
		return results;
	}
}
