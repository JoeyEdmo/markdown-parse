import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.*;

public class MarkdownParseTest{
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    public void parseTestOne() throws IOException{
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        List<String> test1 = List.of("https://something.com","some-page.html");
        assertEquals("test 1", test1, MarkdownParse.getLinks(contents));
    }
    public void parseTestTwo() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String contents = Files.readString(fileName);
        List<String> test2 = List.of("https://something.com","some-page.html");
        assertEquals("test 2", test2, MarkdownParse.getLinks(contents));
    }
}