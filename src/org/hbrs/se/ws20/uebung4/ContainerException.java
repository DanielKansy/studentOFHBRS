package org.hbrs.se.ws20.uebung4;

public class ContainerException extends Throwable {

    private static final long serialVersionUID = 2656959703434537144L;

    private Integer id;

    public void printStackTrace() {

        System.out.println("Das MemberObjekt mit der ID " + this.id + " ist bereits vorhanden!");

    }

    public void addID(Integer id) {

        this.id = id;

    }

}
