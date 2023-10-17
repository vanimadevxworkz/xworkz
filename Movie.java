package com.xworkz.test.things;

public class Movie {
	public static void getMovieInformation() {
		System.out.println("this is getMovieInformation method");
	}
	public static void getMovieInformation(float ratings) {
		System.out.println("movie ratings:"+ratings);
		if(ratings==8.0) {
			System.out.println("movie is good we can watch");
		}else {
			System.out.println("moive is not good");
		}
	}
	public static void getMovieInformation(String movieName,float ratings) {
		System.out.println("movieName is:"+movieName+"ratings is:"+ratings);
		if(movieName=="SSE") {
			System.out.println("this is sse movie");
			return;
		}
	}
	public static boolean released() {
		System.out.println("movie released");
		return false;
	}
	}
