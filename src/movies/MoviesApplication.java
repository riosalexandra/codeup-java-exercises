package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void getAllMoviesFromCategory(String category, Movie[] movies){
        for (Movie movie: movies){
            if (category.equals(movie.getCategory())){
                System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
            }
        }
    }

    public static Movie[] addMovie(Movie newMovie, Movie[] movies){
        Movie[] newMovieArray = new Movie[movies.length + 1];
        for(int i = 0; i < movies.length; i++){
            newMovieArray[i] = movies[i];
        }
        newMovieArray[newMovieArray.length -1] = newMovie;
        return newMovieArray;
    }

    public static void main(String[] args) {
        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();
        int userChoice = -1;
        while (userChoice != 0){
            System.out.println("");
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - add a movie to the list");

//
//            need to play with code to resolve error on line below-- error of .getInput is not being used... figure out why is getInput being used?
//            userChoice = input.getInt("Enter your choice: ");
//
//

            switch(userChoice){
                case 0:
                    break;
                case 1:
                    for (Movie movie: movies){
                        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                    }
                    break;
                case 2:
                    getAllMoviesFromCategory("animated", movies);
                    break;
                case 3:
                    getAllMoviesFromCategory("drama", movies);
                    break;
                case 4:
                    getAllMoviesFromCategory("horror", movies);
                    break;
                case 5:
                    getAllMoviesFromCategory("scifi", movies);
                    break;
                case 6:

//
//                    need to resolve error code for line below... cannot resolve 'getGhost' in 'Input'
//                    why is this being used?
//                    input.getGhost();
//

                    String nameOfMovieToAdd = input.getString("Enter the name of the movie you want to add: ");
                    String categoryOfMovieToAdd = input.getString("Enter the category of the movie you want to add:");
                    Movie newMovie = new Movie(nameOfMovieToAdd, categoryOfMovieToAdd);
                    movies = addMovie(newMovie, movies);
                    break;
            } // end switch statement
        } // end while loop

    } // end main method
} // end class
