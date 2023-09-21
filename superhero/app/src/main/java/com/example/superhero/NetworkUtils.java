package com.example.superhero;

import android.net.Uri;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NetworkUtils {
<<<<<<< HEAD
    //private final static String HERO_BASE_URL = "https://superheroapi.com/api/2558109614336317/search";
    private final static String HERO_BASE_URL = "https://localhost:7095/api/Identity";
=======
    private final static String HERO_BASE_URL = "https://superheroapi.com/api/2558109614336317/search";
>>>>>>> 3cea294cbee5353be170ccb5cc2ba6ff606f586b
    private static URL buildUrl(String queryString) {
        Uri buildUri = Uri.parse(HERO_BASE_URL + "/" + queryString);
    URL url = null;
    try{
        url = new URL(buildUri.toString());

    }catch(MalformedURLException e){
        e.printStackTrace();
    }
    return url;
    }
    private static  String getHeroFromHttpUrl (URL url) throws IOException {
        HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
        try {
            InputStream in = urlConnection.getInputStream();

            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("\\A");

            boolean hasInput = scanner.hasNext();
            if(hasInput){
                return scanner.next();
            }else {
            return null;
            }
        }finally {
            urlConnection.disconnect();
        }
    }
    private static List<Hero> jsonFormatter(String jsonResponse){
        List<Hero> heroList = new ArrayList<>();
        try {
            JSONObject json = new JSONObject(jsonResponse);



<<<<<<< HEAD
                String heroName = json.getString("Name");
                String heroPublisher = json.getString("Publicadora");
                String heroGender = json.getString("Genero");
                String heroRace = json.getString("Race");
=======
                String heroName = json.getString("name");
                String heroAppearence = json.getJSONObject("appearance").getString("first-appearance");
                String heroPublisher = json.getString("publisher");
                String heroGender = json.getString("gender");
                String heroRace = json.getString("race");
>>>>>>> 3cea294cbee5353be170ccb5cc2ba6ff606f586b

                Log.v("currentHero", json.getString("name"));
                Log.v("Data", "Number" + 1);

<<<<<<< HEAD
                Hero hero = new Hero(heroName, heroPublisher, heroGender, heroRace);
=======
                Hero hero = new Hero(heroName, heroAppearence, heroPublisher, heroGender, heroRace);
>>>>>>> 3cea294cbee5353be170ccb5cc2ba6ff606f586b
                heroList.add(hero);

        }catch(JSONException ex){
            Log.v("Network", "Impossível ler o JSON");
        }
        return heroList;
    }
    public static List<Hero> getDataFromAPi (String query) throws  IOException{
        URL apiURL = buildUrl(query);
        String jsonResponse = getHeroFromHttpUrl(apiURL);
        List<Hero> heroList = jsonFormatter(jsonResponse);
        return heroList;
    }
}
