package com.mycompany.test;


import com.mycompany.test.Avestruz;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import sun.jvm.hotspot.utilities.Assert;

/**
 *
 * @author Usuario
 */
public class NewClass {
    public static final Logger logger = LoggerFactory.getLogger(NewClass.class);
    public void canarioTestcase(){
        Canario canario = new Canario ();
        logger.debug("Canario vuela");
        System.out.println("Canario vuela");

        logger.debug("Canario realiza sonido");
        System.out.println("Canario realiza sonido");
        logger.debug("Canario realiza sonido");
        System.out.println("Canario realiza sonido");
        logger.debug("Cambia sonido de ave");
        
    }
}
