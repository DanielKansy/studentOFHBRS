package org.hbrs.se.ws20.uebung4;

import java.util.*;
import java.io.Serializable;

public class Container implements Serializable {

    private ArrayList<UserStory> liste = new ArrayList<>();

    private Modus x = Modus.LIST_TYPE_ARRAY;

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

    public UserStory getlist(int id) {

        for(UserStory item : liste){

            if(id==item.getId()){
                return item;
            }

        }
        return null;
    }

    public void addUserstory(UserStory r) throws ContainerException {

        if(DoesExist(r) == true){

            throw new ContainerException();

        }
        liste.add(r);
    }
    public boolean DoesExist(UserStory ust) {

        for(UserStory us:liste) {
            if(Util.cmpId.compare(us,ust)==0) {
                return true;
            }
        }
        return false;
    }

    public Modus getModus() {
        return x;
    }
    public void setModus(Modus m) {
        this.x = m;
    }

}
