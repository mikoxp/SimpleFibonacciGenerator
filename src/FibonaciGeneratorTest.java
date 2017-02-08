import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by moles on 2017-02-08.
 *
 * @author moles
 */
public class FibonaciGeneratorTest {

    FibonaciGenerator fibonaciGenerator = new FibonaciGenerator();

    @Test
    public void gen_baseNumber_CorrectNumber() {
        assertEquals(55, fibonaciGenerator.gen(10));
    }

    @Test
    public void gen_nis0_CorrectNumber() {
        assertEquals(0, fibonaciGenerator.gen(0));
    }

    @Test
    public void gen_nis1_CorrectNumber() {
        assertEquals(1, fibonaciGenerator.gen(1));
    }

    @Test
    public void gen_nis2_CorrectNumber() {
        assertEquals(1, fibonaciGenerator.gen(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void gen_nisNegative_CorrectNumber() {
        fibonaciGenerator.gen(-2);
    }
}