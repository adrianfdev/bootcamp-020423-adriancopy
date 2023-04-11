package com.example.bootcamp020423.model;

import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {


    private String middleName;
    private String firstName;
    private String lastName;


    Pattern pat = Pattern.compile("\\W");



    public User() {
    }

    public User(String firstName, String middleName, String lastName) {
        this.firstName = firstName.strip();
        this.middleName = middleName.strip();
        this.lastName = lastName.strip();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.strip();
    }

    public String getFirstName() {
        return firstName;
        }

    public void setMiddleName(String middleName) {
        middleName.strip();
        this.middleName = middleName;
    }

        public String getMiddleName() {
            return middleName;
        }

    public void setLastName(String lastName) {
        this.lastName = lastName.strip();
    }

        public String getLastName() {
            return lastName;
        }

        @Override
        public String toString() {
            Matcher mat = pat.matcher(middleName);
            if(mat.find() == true) {

                return "Please type a letter";
            }
            else if (middleName.equals("")) {

                return firstName + "\s" + lastName;
            }
            else
            {
                String middleInitial = Character.toString(middleName.charAt(0));
                return firstName + " " + middleInitial + " " + lastName;
            }



    }

}
