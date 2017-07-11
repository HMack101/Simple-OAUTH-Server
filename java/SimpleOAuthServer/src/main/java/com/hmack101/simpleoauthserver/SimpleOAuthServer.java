/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hmack101.simpleoauthserver;

import com.hmack101.simpleoauthserver.api.ResourceHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

/**
 *
 * @author HMack101
 */
public class SimpleOAuthServer {
        
    private static Logger log = Logger.getLogger(SimpleOAuthServer.class.getName());
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        ResourceConfig config = new ResourceConfig(ResourceHandler.class);
        //config.register(AuthenticationFilter.class);
        
        ServletHolder servlet = new ServletHolder(new ServletContainer(config));

        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(server, "/");
        context.addServlet(servlet, "/*");


        try {
            server.start();
            server.join();
        } catch (Exception ex) {
            log.log(Level.SEVERE, null, ex);
        } 
        
        server.destroy();
       
    }
    
}