package io.datajek.spring.basics.movierecommendersystem.injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CF")
public class CollaborativeFilter implements Filter {
	
	public String[] getRecommendations(String movie) {
		return new String[] {};
	}

}
