package com.example.bootcamp020423.model;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    public void canAbbreviateMiddleName(){

        User user = new User();
        user.setFirstName("Mary");
        user.setMiddleName("Anne");
        user.setLastName("Smith");
        assertEquals("Mary A Smith",user.toString());

    }

    @Test
    public void canRemoveLeadingOrTrailingSpacesInConstructor() {
        User user = new User(" Mary ", " Anne ", " Smith ");
        assertEquals("Mary", user.getFirstName());
        assertEquals("Anne", user.getMiddleName());
        assertEquals("Smith", user.getLastName());
    }
    @Test
    public void canRemoveLeadingOrTrailingSpacesInSetter() {
        User user = new User();
        user.setFirstName("     Mary    ");
        assertEquals("Mary", user.getFirstName());
    }
    @Test
    public void canHandleBlankMiddleName(){

        User user = new User();
        user.setFirstName("Mary");
        user.setMiddleName("");
        user.setLastName("Smith");
        assertEquals("Mary Smith",user.toString());

    }
    @Test
    @Disabled
    public void canHandleRandomCharacterStart(){
        //Instead of trying to handle every random character, tell the user must start with letter

        User user = new User();
        user.setFirstName("Mary");
        user.setMiddleName("-Anne");
        user.setLastName("Smith");
        assertEquals("Please type a letter first",user.toString());

    }



}
