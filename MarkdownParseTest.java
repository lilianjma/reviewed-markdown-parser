import static org.junit.Assert.*;

import java.nio.file.*;
import java.util.*;

import org.junit.*;

public class MarkdownParseTest {

    @Test
    public void testTestFile() throws Exception {
        ArrayList<String> links = MarkdownParse.getLinks(Files.readString(Path.of("test-file.md")));
        String[] expected = {"https://something.com", "some-thing.html"};

        assertArrayEquals(links.toArray(), expected);
    }
}