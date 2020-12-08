package org.hbrs.se.ws20.uebung4;

import java.util.*;
import java.io.Serializable;

public class Container implements Serializable {

    // Liste zur Abspeicherung der Objekte
    private ArrayList<UserStory> liste = new ArrayList<>();

    // Statische Klasse-Variable, um die Referenz auf das einzige Container-Objekt abzuspeichern
    public static Container c = new Container();

    private Container() {

        liste = new ArrayList<UserStory>();

    }

    public static synchronized Container getInstance() {

        if (c == null) {

            c = new Container();

        }
        return c;
    }

    public Container(ArrayList<UserStory> list) {

        list = new ArrayList<UserStory>();

    }

    public ArrayList<UserStory> getList() {

        return liste;

    }

    public UserStory getlist(int ID) {

        for(UserStory item : liste){

            if(ID==item.getId()){
                return item;
            }

        }
        return null;
    }

    // Methode zum Hinzufügen einer Story
    public void addUserstory(UserStory r) throws ContainerException {

        if(Contains(r) == true){

            throw new ContainerException("ID bereits vorhanden!");

        }
        liste.add(r);
    }

    // Methode zum Prüfen ob eine Story bereits vorhanden ist
    public boolean Contains(UserStory ust) {

        for(UserStory us:liste) {

            if(Util.cmpId.compare(us,ust) == 0) {
                return true;
            }

        }
        return false;
    }
}
