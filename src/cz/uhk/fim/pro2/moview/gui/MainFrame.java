package cz.uhk.fim.pro2.moview.gui;

import cz.uhk.fim.pro2.moview.model.*;
import cz.uhk.fim.pro2.moview.utils.DataHandler;
import cz.uhk.fim.pro2.moview.utils.ImageHandler;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {


    public MainFrame(){

        initFrame();
        initTestData();


    }

    private void initFrame(){

        setTitle("Moview");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize((int)(screenSize.width * 0.75), (int)(screenSize.height*0.75));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);;

    }


    private void initTestData() {

        List<Genre> genres = new ArrayList<>(4);
        genres.add(new Genre("Sci-Fi"));
        genres.add(new Genre("Action"));
        genres.add(new Genre("Adventure"));
        genres.add(new Genre("Fantasy"));

        List<Actor> actors = new ArrayList<>(3);

        actors.add(new Actor("Mark Hammil"));
        actors.add(new Actor("Harisson Ford"));
        actors.add(new Actor("Carrie Fisher"));

        List<Rating> ratings = new ArrayList<>(3);

        ratings.add(new Rating("Internet Movie database", "8.6/10"));
        ratings.add(new Rating("Rotten Tomatoes", "93%"));
        ratings.add(new Rating("Metacritic", "90/100"));


        Movie m1 = new Movie("Star Wars - cp. 4", 1977, DataHandler.getDateFromString("25 May 1977"),
                121, genres, "George Lucas", "George Lucas", actors, "...", "USA", "English", ImageHandler.getImageFromUrl("https://lumiere-a.akamaihd.net/v1/images/tros-final-trailer-mobile_0006e343.jpeg?region=0,0,1024,626&width=960"),
                ratings, MovieType.MOVIE

        );
        
           System.out.println(m1);




    }
}
