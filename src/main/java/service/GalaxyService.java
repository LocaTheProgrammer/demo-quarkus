package service;

import model.Hero;
import model.LightSaber;
import model.Movie;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class GalaxyService {

    private List<Hero> heroList = new ArrayList<>();
    private List<Movie> films = new ArrayList<>();

    public GalaxyService() {
        Movie aNewHope = new Movie();

        aNewHope.setTitle("A New Hope");
        aNewHope.setReleaseDate(LocalDate.of(1997, Month.MAY, 25));
        aNewHope.setId(4L);
        aNewHope.setDirector("George Lucas");

        Movie theEmpireStrikesBack = new Movie();
        theEmpireStrikesBack.setTitle("the empire strikes back");
        theEmpireStrikesBack.setReleaseDate(LocalDate.of(1980, Month.MAY, 21));
        theEmpireStrikesBack.setId(5L);
        theEmpireStrikesBack.setDirector("George Lucas");

        Movie returnOfTheJedi = new Movie();
        returnOfTheJedi.setTitle("Return of the jedi");
        returnOfTheJedi.setReleaseDate(LocalDate.of(1983, Month.MAY, 25));
        returnOfTheJedi.setId(6L);
        returnOfTheJedi.setDirector("George Lucas");

        films.add(aNewHope);
        films.add(theEmpireStrikesBack);
        films.add(returnOfTheJedi);

        Hero luke = new Hero();
        luke.setName("Luke");
        luke.setSurname("Skywalker");
        luke.setLightSaber(LightSaber.GREEN);
        luke.setDarkSide(false);
        luke.getEpisodeIds().addAll(Arrays.asList(4L, 5L, 6L));

        Hero leia = new Hero();
        leia.setName("leia");
        leia.setSurname("organa");
        leia.setDarkSide(false);
        leia.getEpisodeIds().addAll(Arrays.asList(4L, 5L, 6L));

        Hero vader = new Hero();
        vader.setName("Darth");
        vader.setSurname("Vader");
        vader.setDarkSide(true);
        vader.setLightSaber(LightSaber.RED);
        vader.getEpisodeIds().addAll(Arrays.asList(4L, 5L, 6L));

        heroList.add(luke);
        heroList.add(leia);
        heroList.add(vader);

    }

    public List<Movie> getAllItems() {
        return films;
    }

    public Movie getFilm(int id) {
        return films.get(id);
    }
}
