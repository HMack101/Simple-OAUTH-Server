/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hmack101.simpleoauthserver;

/**
 *
 * @author HMack101
 */
public class User {
    
    private String firstname;
    private String lastname;
    private String middleInitial;
    private String displayName;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String access;
    private String role;
    private int id;
    private String uuid;
    
    private User(UserBuilder builder) {
        
    }
    
    /**
     * 
     */
    public static class UserBuilder {
        
        private int id;
        private String uuid;
        private String firstname;
        private String lastname;
        private String middleInitial;
        private String displayName;
        private String address1;
        private String address2;
        private String city;
        private String state;
        private String zip;
        private String access;
        private String role;    
        
        /**
         * 
         * @param id
         * @return 
         */
        public UserBuilder setId (int id) {
            this.id = id;
            return this;
        }
        
        /**
         * 
         * @param name
         * @return 
         */
        public UserBuilder setFirstName (String name) {
            this.firstname = name;
            return this;
        }
        
        /**
         * 
         * @param name
         * @return 
         */
        public UserBuilder setLastName (String name) {
            this.lastname = name;
            return this;
        }
        
        /**
         * 
         * @param name
         * @return 
         */
        public UserBuilder setMiddleInitial (String initial) {
            this.middleInitial = initial;
            return this;
        }
        
        /**
         * 
         * @param name
         * @return 
         */
        public UserBuilder setDisplayName (String name) {
            this.displayName = name;
            return this;
        }
        
        /**
         * 
         * @param name
         * @return 
         */
        public UserBuilder setAddress1 (String address) {
            this.address1 = address;
            return this;
        }
        
        /**
         * 
         * @param name
         * @return 
         */
        public UserBuilder setAddress2(String address) {
            this.address2 = address;
            return this;
        }
        
        /**
         * 
         * @param name
         * @return 
         */
        public UserBuilder setCity (String city) {
            this.city = city;
            return this;
        }
        
        /**
         * 
         * @param name
         * @return 
         */
        public UserBuilder setState (String state) {
            this.state = state;
            return this;
        }
        
        /**
         * 
         * @param name
         * @return 
         */
        public UserBuilder setZip (String zip) {
            this.zip = zip;
            return this;
        }
        
        /**
         * 
         * @param name
         * @return 
         */
        public UserBuilder setAccess (String access) {
            this.access = access;
            return this;
        }
        
        /**
         * 
         * @param name
         * @return 
         */
        public UserBuilder setRole (String role) {
            this.role = role;
            return this;
        }
        
        /**
         * 
         * @return 
         */
        public User build() {
            return new User(this);
        }
    }
    
}
