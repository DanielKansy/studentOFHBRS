package org.hbrs.se.ws20.uebung2;

public class ContainerException extends Exception {

    private int nr;

    public void addNR(int nr) {
        this.nr = nr;
    }

    public void printStackTrace() {
        System.out.println("Das MemberObjekt mit der ID " + this.nr + " ist bereits vorhanden.");
    }

}
