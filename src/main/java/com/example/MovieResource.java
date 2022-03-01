package com.example;


import jdk.jfr.Description;
import model.Hero;
import model.Movie;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;
import service.GalaxyService;

import javax.inject.Inject;
import java.util.List;

@GraphQLApi
public class MovieResource {

    @Inject
    GalaxyService galaxyService;

    @Query("allFilms")
    @Description("Get all Films from a galaxy far far away")
    public List<Movie> getAllFilms() {
        return galaxyService.getAllMovies();
    }

    @Query("allHeroes")
    @Description("Get all Heroes from a galaxy far far away")
    public List<Hero> Heroes() {
        return galaxyService.getHeroList();
    }


    @Query
    @Description("film from blablabla")
    public Movie getFilm(@Name("filmId") int id){
        return galaxyService.getFilm(id);
    }

    @Mutation
    public Hero createHero(Hero hero) {
        galaxyService.addHero(hero);
        return hero;
    }

    @Mutation
    public Hero deleteHero(int id) {
        return galaxyService.deleteHero(id);
    }

    @Mutation
    public List<Hero> updateHero(Hero hero){
        return galaxyService.updateHero(hero);
    }



}
