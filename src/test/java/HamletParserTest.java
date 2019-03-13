import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        // given
        // when
        // then
    }

    @Test
    public void testChangeHoratioToTariq() {
        // given
        // when
        // then
    }

    @Test
    public void testFindHoratio() {
        // given
        HamletParser hamletParser = new HamletParser();
        String text = hamletParser.getHamletData();
        // when
        // then
    }

    @Test
    public void testFindHamlet() {
        // given
        // when
        // then
    }
}