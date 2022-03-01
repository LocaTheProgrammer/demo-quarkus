package model;

import java.util.ArrayList;
import java.util.List;

public class Hero {

    private Long id;
    private String name;
    private String surname;
    private Boolean darkSide;
    private LightSaber lightSaber;
    private List<Long> episodeIds = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Boolean getDarkSide() {
        return darkSide;
    }

    public void setDarkSide(Boolean darkSide) {
        this.darkSide = darkSide;
    }

    public LightSaber getLightSaber() {
        return lightSaber;
    }

    public void setLightSaber(LightSaber lightSaber) {
        this.lightSaber = lightSaber;
    }

    public List<Long> getEpisodeIds() {
        return episodeIds;
    }

    public void setEpisodeIds(List<Long> episodeIds) {
        this.episodeIds = episodeIds;
    }
}
