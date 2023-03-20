package com.codewithSI.fullstackbackend;

import com.codewithSI.fullstackbackend.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    public void testGetRegno() {
        User user = new User();
        user.setRegno("D/BSE/21/0012");
        assertEquals("D/BSE/21/0012", user.getRegno());
    }

    @Test
    public void testGetFirstname() {
        User user = new User();
        user.setFirstname("Sathsara");
        assertEquals("Sathsara", user.getFirstname());
    }

    @Test
    public void testGetLastname() {
        User user = new User();
        user.setLastname("Pramodya");
        assertEquals("Pramodya", user.getLastname());
    }

    @Test
    public void testGetStudentmail() {
        User user = new User();
        user.setStudentmail("sathsarapramodya@gmail.com");
        assertEquals("sathsarapramodya@gmail.com", user.getStudentmail());
    }

    @Test
    public void testGetBirthday() {
        User user = new User();
        user.setBirthday("2001.01.25");
        assertEquals("2001.01.25", user.getBirthday());
    }

    @Test
    public void testGetDegree() {
        User user = new User();
        user.setDegree("Software Engineering");
        assertEquals("Software Engineering", user.getDegree());
    }

    @Test
    public void testGetId() {
        User user = new User();
        user.setId(1L);
        assertEquals(1L, user.getId().longValue());
}


}

