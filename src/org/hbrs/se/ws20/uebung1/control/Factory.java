package org.hbrs.se.ws20.uebung1.control;

import com.sun.java.accessibility.util.Translator;

public class Factory {

    public static GermanTranslator createGermanTranslator(){
        return new GermanTranslator();
    }

}
