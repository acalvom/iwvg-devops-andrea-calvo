package es.upm.miw.iwvg_devops.practise;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private List<Fraction> testFractions = List.of(
            new Fraction(2, 1),
            new Fraction(-1, 5),
            new Fraction(2, 4),
            new Fraction(4, 3)
    );
    private User testUser;

    @Test
    void testGetId() {
        testUser = new User("TestID", "TestName", "TestFamilyName", testFractions);
        assertEquals("TestID", testUser.getId());
    }

    @Test
    void testGetName() {
        testUser = new User("TestID", "TestName", "TestFamilyName", testFractions);
        assertEquals("TestName", testUser.getName());
    }

    @Test
    void testSetName() {
        testUser = new User("TestID", "TestName", "TestFamilyName", testFractions);
        testUser.setName("NewTestName");
        assertEquals("NewTestName", testUser.getName());
    }

    @Test
    void testGetFamilyName() {
        testUser = new User("TestID", "TestName", "TestFamilyName", testFractions);
        assertEquals("TestFamilyName", testUser.getFamilyName());
    }

    @Test
    void testSetFamilyName() {
        testUser = new User("TestID", "TestName", "TestFamilyName", testFractions);
        testUser.setFamilyName("NewTestFamilyName");
        assertEquals("NewTestFamilyName", testUser.getFamilyName());
    }

    @Test
    void testGetFractions() {
        testUser = new User("TestID", "TestName", "TestFamilyName", testFractions);
        assertEquals(testFractions, testUser.getFractions());
    }

    @Test
    void testSetFractions() {
        testUser = new User("TestID", "TestName", "TestFamilyName", testFractions);
        List<Fraction> testNewFractions = List.of(
                new Fraction(0, 1),
                new Fraction(1, 1),
                new Fraction(2, 1)
        );
        testUser.setFractions(testNewFractions);
        assertEquals(testNewFractions, testUser.getFractions());
    }

    @Test
    void testAddFractions() {

        List<Fraction> fractionsArray = new ArrayList<Fraction>();
        fractionsArray.add(new Fraction(1, 3));
        fractionsArray.add(new Fraction(1, 4));
        testUser = new User("TestID", "TestName", "TestFamilyName", fractionsArray);
        Fraction newFraction = new Fraction(3, 1);
        testUser.addFraction(newFraction);
        assertEquals(newFraction, testUser.getFractions().get(2));
    }

    @Test
    void testFullName() {
        testUser = new User("TestID", "TestName", "TestFamilyName", testFractions);
        assertEquals("TestName TestFamilyName", testUser.fullName());
    }

    @Test
    void testNameInitials() {
        testUser = new User("IdToTest", "nameToTest", "familyNameToTest", testFractions);
        assertEquals("n.", testUser.nameInitials());
    }

}
