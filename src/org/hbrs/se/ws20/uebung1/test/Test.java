package org.hbrs.se.ws20.uebung1.test;

import org.hbrs.se.ws20.uebung1.control.*;
import org.hbrs.se.ws20.uebung1.view.*;

public class Test {

    private Translator translator = null;
    private Client Client = null;

    public Test() {
        Client = new Client();
        translator = new GermanTranslator();

        Client.setTranslator(translator);
    }

    public void test() {
        // 3 Positive
        Client.display(3);
        Client.display(2);
        Client.display(5);

        // 3 Negative
        Client.display(-3);
        Client.display(12);
        Client.display(-8);
    }

    public static void main(String[] args) {
        Test ts = new Test();
        ts.test();
    }

}
