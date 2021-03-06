/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jlab.utils;

/**
 *
 * @author gavalian
 */
public class CLASResources {
    
    public static String getResourcePath(String resource){
        String CLAS12DIR = System.getenv("CLAS12DIR");
        String CLAS12DIRPROP = System.getProperty("CLAS12DIR");
        if(CLAS12DIR!=null){
            return CLAS12DIR + "/" + resource;
        } else {
            System.err.println("[getResourcePath]---> warning the system "
                + " environment CLAS12DIR is not set.");
            if(CLAS12DIRPROP!=null){
                return CLAS12DIRPROP + "/" + resource;
            } else {
                System.err.println("[getResourcePath]---> warning the system "
                + " property CLAS12DIR is not set.");
            }
        }
        
        return null;
    }
}
