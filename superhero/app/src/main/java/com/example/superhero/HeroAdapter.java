package com.example.superhero;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.superhero.Hero;
import com.example.superhero.R;


public class HeroAdapter extends ArrayAdapter<Hero> {

    public HeroAdapter(@NonNull Context context){
        super(context, 0);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View view = convertView;
        if (view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.hero_item, parent, false);
        }
        TextView heroName = view.findViewById(R.id.heroName);
<<<<<<< HEAD
=======
        TextView heroAppearence = view.findViewById(R.id.heroAppearance);
>>>>>>> 3cea294cbee5353be170ccb5cc2ba6ff606f586b
        TextView heroPublisher = view.findViewById(R.id.heroPublisher);
        TextView heroGender = view.findViewById(R.id.heroGender);
        TextView heroRace = view.findViewById(R.id.heroRace);

        Hero currentHero = getItem(position);

        heroName.setText(currentHero.getName());
<<<<<<< HEAD
=======
        heroAppearence.setText(currentHero.getAppearence());
>>>>>>> 3cea294cbee5353be170ccb5cc2ba6ff606f586b
        heroPublisher.setText(currentHero.getPublisher());
        heroGender.setText(currentHero.getGender());
        heroRace.setText(currentHero.getRace());

            return  view;
    }
}
