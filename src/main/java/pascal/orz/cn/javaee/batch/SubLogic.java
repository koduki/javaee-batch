/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal.orz.cn.javaee.batch;

import javax.ejb.Stateless;

/**
 *
 * @author koduki
 */
@Stateless
public class SubLogic {
    public String message(){
        return "Hello WOrld.";
    }
}
