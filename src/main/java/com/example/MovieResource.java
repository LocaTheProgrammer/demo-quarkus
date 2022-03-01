package com.example;


import jdk.jfr.Description;
import model.Movie;
import org.eclipse.microprofile.graphql.GraphQLApi;
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
        return galaxyService.getAllItems();
    }


    @Query()
    @Description("film from blablabla")
    public Movie getFilm(@Name("filmId") int id){
        return galaxyService.getFilm(id);
    }



}
