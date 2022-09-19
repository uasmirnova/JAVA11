package ru.netology.movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

    String movie1 = "Бладшот";
    String movie2 = "Вперед";
    String movie3 = "Отель Белград";
    String movie4 = "Джентльмены";
    String movie5 = "Человек-невидимка";
    String movie6 = "Тролли";
    String movie7 = "Гарри Поттер";
    String movie8 = "Послезавтра";
    String movie9 = "Война и мир";
    String movie10 = "Детективы";
    String movie11 = "Тролли2";


    @Test
    public void shouldAddMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovies(movie1);
        manager.addMovies(movie2);
        manager.addMovies(movie3);
        manager.addMovies(movie4);
        manager.addMovies(movie5);
        manager.addMovies(movie6);

        String[] expected = { movie1, movie2, movie3, movie4, movie5, movie6 };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast5moviesFrom6() {
        MovieManager manager = new MovieManager(5);

        manager.addMovies(movie1);
        manager.addMovies(movie2);
        manager.addMovies(movie3);
        manager.addMovies(movie4);
        manager.addMovies(movie5);
        manager.addMovies(movie6);

        String[] expected = { movie6, movie5, movie4, movie3, movie2 };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast5moviesFrom5() {
        MovieManager manager = new MovieManager(5);

        manager.addMovies(movie1);
        manager.addMovies(movie2);
        manager.addMovies(movie3);
        manager.addMovies(movie4);
        manager.addMovies(movie5);

        String[] expected = { movie5, movie4, movie3, movie2, movie1 };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast5moviesFrom4() {
        MovieManager manager = new MovieManager(5);

        manager.addMovies(movie1);
        manager.addMovies(movie2);
        manager.addMovies(movie3);
        manager.addMovies(movie4);

        String[] expected = { movie4, movie3, movie2, movie1 };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastDefault() {
        MovieManager manager = new MovieManager();

        manager.addMovies(movie1);
        manager.addMovies(movie2);
        manager.addMovies(movie3);
        manager.addMovies(movie4);
        manager.addMovies(movie5);
        manager.addMovies(movie6);

        String[] expected = { movie6, movie5, movie4, movie3, movie2, movie1 };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastDefaultOver() {
        MovieManager manager = new MovieManager();

        manager.addMovies(movie1);
        manager.addMovies(movie2);
        manager.addMovies(movie3);
        manager.addMovies(movie4);
        manager.addMovies(movie5);
        manager.addMovies(movie6);
        manager.addMovies(movie7);
        manager.addMovies(movie8);
        manager.addMovies(movie9);
        manager.addMovies(movie10);
        manager.addMovies(movie11);

        String[] expected = { movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2 };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
