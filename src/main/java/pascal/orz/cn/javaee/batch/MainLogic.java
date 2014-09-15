/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal.orz.cn.javaee.batch;

import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author koduki
 */
@Stateless
@DataSourceDefinition(
          name="pascal.orz.cn_JavaEE-Batch_jar_1.0-SNAPSHOTPU",
          className="org.apache.derby.jdbc.ClientDriver",
          user="app",
          password="app",
          databaseName="sample",
          serverName="localhost",
          portNumber=1527 )
public class MainLogic {

    @PersistenceContext(unitName = "pascal.orz.cn_JavaEE-Batch_jar_1.0-SNAPSHOTPU")
    private EntityManager em;

    @EJB
    SubLogic subLogic;

    public void run() {
        System.out.println(subLogic.message());

        SimpleEntity entity = new SimpleEntity();
        entity.setName("foo");
        em.persist(entity);

        System.out.println("save finish.");
    }
}
