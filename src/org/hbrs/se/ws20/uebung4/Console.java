package org.hbrs.se.ws20.uebung4;

import java.util.*;

public class Console {

    Scanner sc = new Scanner(System.in);

    StringBuffer stringa = new StringBuffer();

    public int InsertInt() {

        return Integer.parseInt(sc.nextLine());

    }

    public StringBuffer InsertString(){

        return stringa.append(sc.nextLine());

    }

}
