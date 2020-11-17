package org.hbrs.se.ws20.uebung2;

public class Member2 implements Member {

    private Integer nr = null;

    private Integer id = null;

    public Member2(int nr){
        this.nr = nr;
    }

    public Integer getID() {
        return this.id;
    }

    public void setID (int nr) {
        this.nr = nr;
    }

    public String toString() {
        return "Member2 [ id=" + id + " ]";
    }

}
