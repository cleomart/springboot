package io.datajek.spring.basics.movierecommendersystem.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {
	
	
	private Filter filter;
	
	
	// Setter Injection
	@Autowired
	@Qualifier("contentBasedFilter")
	public void setFilter(Filter filter) {
	    this.filter = filter;
	    System.out.println("Setter method invoked..");
	}

	public String[] recommendMovies(String movie) {
		System.out.println("Name of the filter in use: " + filter);
		String[] results = this.filter.getRecommendations(movie);
		return results;
	}
}
