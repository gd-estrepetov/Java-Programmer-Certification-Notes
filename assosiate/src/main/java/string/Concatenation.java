package string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Rules for concatenation:
 * 1. If both operands are numeric -> addition is numeric
 * 2. If one operand String -> string concatenation
 * 3. Expression is evaluated from left to right
 */
public class Concatenation {

    @Test
    public void basic() {
        // 1 + 2 = 3
        assertEquals(1 + 2, 3);

        // "a" + "b" = "ab" => "ab" +3 = "ab3"
        assertEquals("a" + "b" + 3, "ab3");

        // 1 + 3 = 4 => 4 + "8" = "48"
        assertEquals(1 + 3 + "8", "48");

        // 1 + 2 = 3 => 3 + 3 = 6 => 6 + "4" = "64"
        int three = 3;
        String four = "4";
        assertEquals(1 + 2 + three + four, "64");
    }

    @Test
    public void withAssignment() {
        // "=+" operand uses same rule as usual concatenation
        String s1 = "3";
        s1+=2;
        s1+="1";
        assertEquals(s1, "321");
    }

}
