import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void parseTestOne() throws IOException{
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        List<String> test1 = List.of("https://something.com","some-page.html");
        assertEquals("test 1", test1, MarkdownParse.getLinks(contents));
    }
    @Test
    public void parseTestTwo() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String contents = Files.readString(fileName);
        List<String> test2 = List.of("https://i.imgur.com/kW021Ap.png","google.com");
        assertEquals("test 2", test2, MarkdownParse.getLinks(contents));
    }
    @Test
    public void parseTestThree() throws IOException{
        Path fileName = Path.of("4-file-1.md");
        String contents = Files.readString(fileName);
        List<String> test3 = List.of("url.com","`google.com", "google.com", "ucsd.edu" );
        assertEquals("test 3", test3, MarkdownParse.getLinks(contents));
    }
}

//test

