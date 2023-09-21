package com.example.superhero;

public class Hero {
    private String name;
<<<<<<< HEAD
=======
    private String appearence;
>>>>>>> 3cea294cbee5353be170ccb5cc2ba6ff606f586b
    private String publisher;
    private String gender;
    private String race;

    private final String nameStart = "Nome: ";
<<<<<<< HEAD
=======
    private final String appearenceStart = "Primeira Aparição: ";
>>>>>>> 3cea294cbee5353be170ccb5cc2ba6ff606f586b
    private final String publisherStart = "Publicadora: ";
    private final String genderStart = "Gênero: ";
    private final String raceStart = "Raça: ";

<<<<<<< HEAD
    public Hero(String name, String publisher, String gender, String race) {
        this.name = name;
=======
    public Hero(String name, String appearence, String publisher, String gender, String race) {
        this.name = name;
        this.appearence = appearence;
>>>>>>> 3cea294cbee5353be170ccb5cc2ba6ff606f586b
        this.publisher = publisher;
        this.gender = gender;
        this.race = race;
    }

    public String getName() {
        return this.nameStart + name;
    }

<<<<<<< HEAD
=======
    public String getAppearence() {
        return this.appearenceStart + appearence;
    }
>>>>>>> 3cea294cbee5353be170ccb5cc2ba6ff606f586b

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

<<<<<<< HEAD
=======
    public String getAppearenceStart() {
        return appearenceStart;
    }

>>>>>>> 3cea294cbee5353be170ccb5cc2ba6ff606f586b
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
