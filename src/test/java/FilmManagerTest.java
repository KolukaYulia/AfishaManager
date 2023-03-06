import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void testAddFilms() {
        FilmManager manager = new FilmManager();

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");

        String[] expected = { "Film1", "Film2", "Film3", "Film4" };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddFilmsThenOne() {
        FilmManager manager = new FilmManager();

        manager.add("Film1");


        String[] expected = { "Film1" };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastFilms() {
        FilmManager manager = new FilmManager();

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");
        manager.add("Film11");
        manager.add("Film12");


        String[] expected = { "Film12", "Film11", "Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3" };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastFilmsLessLimit() {
        FilmManager manager = new FilmManager();

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");



        String[] expected = { "Film6", "Film5", "Film4", "Film3", "Film2", "Film1", };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastFilmsThenSetLimit() {
        FilmManager manager = new FilmManager(5);

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");




        String[] expected = { "Film9", "Film8", "Film7", "Film6", "Film5" };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastFilmsThenSetLimitAndLessLimit() {
        FilmManager manager = new FilmManager(5);

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");





        String[] expected = { "Film4", "Film3", "Film2", "Film1", };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }





}
