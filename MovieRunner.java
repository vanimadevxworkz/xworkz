package com.xworkz.test.driver;
import com.xworkz.test.things.Movie;

public class MovieRunner {
	public static void main(String args[]) {
		Movie.getMovieInformation();
		Movie.getMovieInformation(8.0f);
		Movie.getMovieInformation("sse",9.0f);
		boolean released=Movie.released();
		if(released==true) {
		System.out.println("movie is released");
		}else {
			System.out.println("movie is not released");
		}
	}

}
