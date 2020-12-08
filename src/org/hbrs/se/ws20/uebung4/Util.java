package org.hbrs.se.ws20.uebung4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Util {

    public static int Prio (UserStory x) {

        return (x.getMehrwert() + x.getRisk()) / (x.getAufwand() + x.getRisk());

    }

    public static Comparator<UserStory> c = new Comparator<UserStory>() {
        public int compare(UserStory u1, UserStory u2) {

            return (int) (u1.getPrio() - u2.getPrio());

        }
    };

    public static Comparator<UserStory> cmpId = new Comparator<UserStory>() {

        public int compare(UserStory u1, UserStory u2) {
            return u1.getId() - u2.getId();
        }

    };

    public static <T extends UserStory> void sortieren(Comparator<UserStory> cmp, ArrayList<UserStory> list) {

        Collections.sort(list, cmp);

    }

}
