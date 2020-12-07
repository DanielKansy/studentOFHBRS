package org.hbrs.se.ws20.uebung4;

import java.util.Scanner;

public class EingabeDialog {

    Scanner sc = new Scanner(System.in);

    public void befehle(Scanner sc) {

        while(sc.hasNext()) {

            StringBuffer sb = new StringBuffer(sc.next());

            if(sb.toString().startsWith("Anzeige aller möglichen Befehle")) {

                System.out.print("Wählen Sie eine Funktion aus: (Enter, Store, Load, Dump, Exit)");

            }

            if(sb.toString().startsWith("Load")) {

                PersistentManager.load();

            }
            if(sb.toString().startsWith("Store")) {

                PersistentManager.store();

            }
            if(sb.toString().startsWith("Enter")) {

                Console x = new Console();

                System.out.println("ID: ");
                int id = x.InsertInt();

                System.out.println("Titel: ");
                StringBuffer titel = x.InsertString();

                System.out.println("Aufwand: ");
                int aufwand = x.InsertInt();

                System.out.println("Risiko: ");
                int risiko = x.InsertInt();

                System.out.println("Strafe: ");
                int strafe = x.InsertInt();

                System.out.println("Mehrwert: ");
                int mehrwert = x.InsertInt();

                int prio = ((risiko + aufwand) / (strafe + mehrwert));

                System.out.println("ID" + id + "Prio:" + prio);

                UserStory us = new UserStory(id, titel, strafe, mehrwert, aufwand, risiko, prio);

                if (aufwand > 4) {

                    System.out.println("Die ID: " + id + "Titel: " + titel + "Aufwand: " + aufwand);

                }

                else {
                    System.out.println("Aufwand weniger als 4 -> Keine Anzeige!");
                }

                try {

                    Container.getInstance().addUserstory(us);

                } catch (ContainerException e) {

                    System.out.println("Fehler:" + e.getMessage());

                }
            }
        }
    }
}
