package org.main;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class PrimaryController {
    Integer[] indexes;
    int currentIndex = -1;
    String[] Actors = {"Robert Downey, Jr.","Leonardo DiCaprio","Samy Naceri","Bruce Willis","Bud Spencer","Harrison Ford","Terence Hill","Szamár/Eddie Murphy","Adam Sandler","Zendaya"};
    String[] VActors = {"Fekete Ernő Tibor","Hevér Gábor","Görög László","Dörner György","Bujtor István","Csernák János","Ujréti László","Kerekes József","Csőre Gábor","Csuha Bori"};
    String[] Movies = {"A vasember","Eredet","Taxi","Die Hard","Kincs, ami nincs","Indiana Jones 3","Kincs, ami nincs","Shrek","Távkapcs","???",""};

    //region Imports
    public Button StartB;
    public HBox MainBox;
    public TextField NameP0;
    public Label PointP0;
    public HBox BoxP0;
    public TextField NameP1;
    public Label PointP1;
    public HBox BoxP1;
    public TextField NameP2;
    public Label PointP2;
    public HBox BoxP2;
    public TextField NameP3;
    public Label PointP3;
    public HBox BoxP3;
    public TextField NameP4;
    public Label PointP4;
    public HBox BoxP4;
    public TextField NameP5;
    public Label PointP5;
    public HBox BoxP5;
    public TextField NameP6;
    public Label PointP6;
    public HBox BoxP6;
    public TextField NameP7;
    public Label PointP7;
    public HBox BoxP7;
    public TextField NameP8;
    public Label PointP8;
    public HBox BoxP8;
    public TextField NameP9;
    public Label PointP9;
    public HBox BoxP9;
    public ImageView Photo;
    public Label AName;
    public Label VAName;
    public Label MName;
    //endregion

    //region AddPoints
    public void AddPoints(int x, Label label){
        label.setText(Integer.toString(Integer.parseInt(label.getText())+x));
    }

    public void Add100P0() {AddPoints(100, PointP0);}

    public void Add40P0() {AddPoints(40, PointP0);}

    public void Add100P1() {AddPoints(100, PointP1);}

    public void Add40P1() {AddPoints(40, PointP1);}

    public void Add100P2() {AddPoints(100, PointP2);}

    public void Add40P2() {AddPoints(40, PointP2);}

    public void Add100P3() {AddPoints(100, PointP3);}

    public void Add40P3() {AddPoints(40, PointP3);}

    public void Add100P4() {AddPoints(100, PointP4);}

    public void Add40P4() {AddPoints(40, PointP4);}

    public void Add100P5() {AddPoints(100, PointP5);}

    public void Add40P5() {AddPoints(40, PointP5);}

    public void Add100P6() {AddPoints(100, PointP6);}

    public void Add40P6() {AddPoints(40, PointP6);}

    public void Add100P7() {AddPoints(100, PointP7);}

    public void Add40P7() {AddPoints(40, PointP7);}

    public void Add100P8() {AddPoints(100, PointP8);}

    public void Add40P8() {AddPoints(40, PointP8);}

    public void Add100P9() {AddPoints(100, PointP9);}

    public void Add40P9() {AddPoints(40, PointP9);}
    //endregion

    public void Start() {
        indexes = new Integer[Actors.length];
        for (int i = 0; i < Actors.length; i++) {
            indexes[i]=i; }
        List<Integer> list =Arrays.asList(indexes);
        Collections.shuffle(list);
        list.toArray(indexes);
        System.out.println(Arrays.toString(indexes));


        StartB.setVisible(false);
        MainBox.setVisible(true);
        Next();
    }

    public void PlaySound() {
        Media media = new Media(Objects.requireNonNull(getClass().getResource("sound"+indexes[currentIndex]+".mp3")).toExternalForm());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

    public void Reveal() {
        Image image = new Image(Objects.requireNonNull(getClass().getResource("photo"+ indexes[currentIndex]+".png")).toExternalForm());
        Photo.setImage(image);
        AName.setText(Actors[indexes[currentIndex]]);
        VAName.setText(VActors[indexes[currentIndex]]);
        MName.setText(Movies[indexes[currentIndex]]);
    }

    public void Next() {
        currentIndex++;

        Image image = new Image(Objects.requireNonNull(getClass().getResource("sziluett"+indexes[currentIndex]+".png")).toExternalForm());
        Photo.setImage(image);
        AName.setText("-----------------");
        VAName.setText("-----------------");
        MName.setText("-----------------");
    }


}
