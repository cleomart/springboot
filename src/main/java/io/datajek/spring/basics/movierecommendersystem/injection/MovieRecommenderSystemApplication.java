package io.datajek.spring.basics.movierecommendersystem.injection;
import org.springframework.context.ApplicationContext;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(        
                MovieRecommenderSystemApplication.class, args);
		
		RecommenderImplementation2 recommender = appContext.getBean(RecommenderImplementation2.class);
		
		String[] result = recommender.recommendMovies("Finding Dory");
		
		System.out.println(Arrays.toString(result));

	}

}
