/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal.orz.cn.javaee.batch;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;

/**
 *
 * @author koduki
 */
public class Main {

    public static void main(String[] args) throws NamingException {
        try (EJBContainer container = EJBContainer.createEJBContainer()) {
            String jndi = "java:global/javaee-batch/MainLogic";
            MainLogic logic = (MainLogic) container.getContext().lookup(jndi);
            logic.run();
        }
    }
}
