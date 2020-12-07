package org.hbrs.se.ws20.uebung4;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.io.FileInputStream;
import java.io.IOException;

public class PersistentManager {

    public static void store(){

        try {

            ObjectOutputStream stream = new ObjectOutputStream (new FileOutputStream("File.data"));
            stream.writeObject(Container.getInstance().getList());
            stream.close();

        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void load() {

        try {

            ObjectInputStream stream2 = new ObjectInputStream (new FileInputStream("File.data"));
            ArrayList<UserStory> us = (ArrayList<UserStory>) stream2.readObject();
            Iterator<UserStory> i = us.iterator();
            Container c = Container.getInstance();

            while (i.hasNext()) {

                try {
                    c.addUserstory(i.next());
                }

                catch (ContainerException e) {

                }

            }

            stream2.close();

        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
