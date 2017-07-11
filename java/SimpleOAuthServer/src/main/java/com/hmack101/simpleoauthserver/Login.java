package com.hmack101.simpleoauthserver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HMack101
 */
public class Login {
    
    private String username;
    private String password;
    
  
    private Login (LoginBuilder builder) {
        this.username = builder.username;
        this.password = builder.password;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public static class LoginBuilder {
        private String username;
        private String password;
        
        public LoginBuilder (String username, String password) {
            this.username = username;
            this.password = password;
        }
        
        public LoginBuilder setUsername (String username) {
            this.username = username;
            return this;
        }
        
        public LoginBuilder setPassword (String password) {
            this.password = password;
            return this;
        }
        
        public Login build() {
            return new Login(this);
        }
    }
    
}
