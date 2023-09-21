package com.example.superhero;

public class Hero {
    private String name;
    private String publisher;
    private String gender;
    private String race;

    private final String nameStart = "Nome: ";
    private final String publisherStart = "Publicadora: ";
    private final String genderStart = "Gênero: ";
    private final String raceStart = "Raça: ";

    public Hero(String name, String publisher, String gender, String race) {
        this.name = name;
        this.publisher = publisher;
        this.gender = gender;
        this.race = race;
    }

    public String getName() {
        return this.nameStart + name;
    }


    public String getPublisher() {
        return this.publisherStart + publisher;
    }

    public String getGender() {
        return this.genderStart + gender;
    }

    public String getRace() {
        return this.raceStart + race;
    }

    public String getNameStart() {
        return nameStart;
    }

    public String getPublisherStart() {
        return publisherStart;
    }

    public String getGenderStart() {
        return genderStart;
    }

    public String getRaceStart() {
        return raceStart;
    }
}
