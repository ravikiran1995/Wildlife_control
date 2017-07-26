package com.example.ravikiran.wildlife;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by RaviKiran on 7/25/2017.
 */

public class upload_crime_info {

    public String imgurl;
    public String location;
    public String offense;
    public String Species;
    public String animal_name;
    public String animal_condition;

    public upload_crime_info() {
    }

    public upload_crime_info(String imgurl, String location, String offense, String species, String animal_name, String animal_condition) {
        this.imgurl = imgurl;
        this.location = location;
        this.offense = offense;
        this.Species = species;
        this.animal_name = animal_name;
        this.animal_condition = animal_condition;
    }

    public String getImgurl() {
        return imgurl;
    }

    public String getLocation() {
        return location;
    }

    public String getOffense() {
        return offense;
    }

    public String getSpecies() {
        return Species;
    }

    public String getAnimal_name() {
        return animal_name;
    }

    public String getAnimal_condition() {
        return animal_condition;
    }
}
