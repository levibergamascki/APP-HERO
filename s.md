### No mainactivity java

package com.example.apisuper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageSlider imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.vingadores, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.ligadajustica, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.flash, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
    }
}

____

### No activity main xml

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#6BFF7A"
    tools:context=".MainActivity">
    <androidx.cardview.widget.CardView
        android:layout_width="match_parent"
        android:layout_height="200dp"
        app:cardBackgroundColor="#6BFF7A"
        android:layout_marginTop="30dp"
        android:layout_marginEnd="20dp"
        android:layout_marginStart="20dp"
        app:cardElevation="20dp"
        app:cardCornerRadius="20dp">

        <com.denzcoskun.imageslider.ImageSlider
            android:layout_width="match_parent"
            android:layout_height="200dp"
            android:id="@+id/imageSlider"
            app:iss_period="1000"
            app:iss_auto_cycle="true"
            app:iss_delay="1000"
            app:iss_corner_radius="20" app:iss_title_background="@drawable/gradient">

        </com.denzcoskun.imageslider.ImageSlider>
    </androidx.cardview.widget.CardView>


</RelativeLayout>

______________



### outros: 

-- settings gradle

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io'}
    }
}
rootProject.name = "APIsuper"
include ':app'

-- build gradle

    implementation 'com.github.denzcoskun:ImageSlideshow:0.1.0'
    
-- imagens no drawable 
