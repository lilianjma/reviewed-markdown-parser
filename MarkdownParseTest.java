import static org.junit.Assert.*;

import java.nio.file.*;
import java.util.*;

import org.junit.*;

public class MarkdownParseTest {

    @Test
    public void testFile1() throws Exception {
        ArrayList<String> links = MarkdownParse.getLinks(Files.readString(Path.of("test-file.md")));
        String[] expected = {"https://something.com", "some-thing.html"};

        assertArrayEquals(expected, links.toArray());
    }

    @Test
    public void testFile5() throws Exception {
        ArrayList<String> links = MarkdownParse.getLinks(Files.readString(Path.of("test-file5.md")));
        String[] expected = {};

        assertArrayEquals(expected, links.toArray());
    }
}