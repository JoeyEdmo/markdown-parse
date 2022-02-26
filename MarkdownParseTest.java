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
    @Test
    public void parseTestFour() throws IOException{
        Path fileName = Path.of("4-file-2.md");
        String contents = Files.readString(fileName);
        List<String> test4 = List.of("a.com", "b.com", "a.com(())", "example.com");
        assertEquals("test 4", test4, MarkdownParse.getLinks(contents));
    }
    @Test
    public void parseTestFive() throws IOException{
        Path fileName = Path.of("4-file-3.md");
        String contents = Files.readString(fileName);
        List<String> test5 = List.of("https://www.twitter.com", "https://ucsd-cse15l-w22.github.io/", "https://cse.ucsd.edu/");
        assertEquals("test 5", test5, MarkdownParse.getLinks(contents));
    }
}

//test

