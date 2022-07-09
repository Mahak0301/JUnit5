import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Mahak1 {
    @Test
    void testassertequal(){
        assertEquals("ABC","ABC");
        assertEquals(20,20,"Optional Assertion Message");
        assertEquals(2+2,4);
    }
    @Test
    void testassertfalse(){
        assertFalse(10>20,"Assertion message");
    }
    @Test
    void testassertnull(){
        String str1;
        String str2;
        str1="ABC";
        str2=null;
        assertNull(str1);
        assertNotNull(str2);
    }
    @Test
    void testassertall(){
     String s1="Mahak";
     String s2="Jain";
     String s3="JECRCU";
     assertAll("numbers",()->assertEquals(s1,"Mahak"),
             ()->assertEquals(s2,"Jain"),
             ()->assertEquals(s3,"JECRCU"));
    }
    @Test
    void testasserttrue(){
        assertTrue("Mahak".startsWith("M"));
    }
}
