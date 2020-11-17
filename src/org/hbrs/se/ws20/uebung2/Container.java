package org.hbrs.se.ws20.uebung2;

import java.util.ArrayList;
import java.util.List;

public class Container {

    // Liste für die "Member"
    private List<Member> list = new ArrayList<Member>();

    // Hinzufügen der "Member"
    public void addMember (Member x) throws ContainerException {
        if (contains(x) == true)
        {
            ContainerException y = new ContainerException();
            y.addNR (x.getID());
            throw y;
        }
        list.add(x);
    }

    // Prüfung ob "Member" in Liste eingetragen ist
    private boolean contains(Member x) {
        Integer ID = x.getID();
        for (Member y : list) {
            if (y.getID().intValue() == ID.intValue())
            {
                return true;
            }
        }
        return false;
    }

    // Anzahl der "Member"-Objekte
    public int size(){
        return list.size();
    }

    // Löschen eines "Member"
    public String deleteMember(int nr) {
        Member y = getMember(nr);
        if (y == null) return "Member nicht vorhanden!";
        else
        {
            list.remove(y);
            return "Member mit NR " + nr + " konnte erfolgreich gelöscht werden!";
        }
    }

    // Suche von "Member"
    private Member getMember(int nr) {
        for (Member y : list) {
            if (nr == y.getID().intValue() )
            {
                return y;
            }
        }
        return null;
    }

    public void dump() {
        System.out.println("Member Objekte Ausgabe: ");
    }

    // Durchlaufen mit foreach-Schleife
    /*
    for (Member p : list) {
        System.out.println(p.toString());
    }
    */
}
