import static org.junit.Assert.assertEquals;
import org.junit.*;
import java.util.List;

import org.junit.Test;

public class MarkdownParseTest {
    @Test  
    public void addition(){
        assertEquals(5, 5+1-1);
    }
    @Test
    public void parseTestOne() throws IOException{
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        List<String> whatever = List.of("https://something.com", "some-page.html");
        assertEquals("this is test" , whatever, MarkdownParse.getLinks(contents));
    }
    @Test
    public void parseTestTwo() throws IOException{
        Path fileName = Path.of("test-file2.md");
	    String contents = Files.readString(fileName);
        List<String> whatever = List.of("Invalid Input", "[new link)(https://google.com)");
        assertEquals("this is test2" , whatever, MarkdownParse.getLinks(contents));
    }
    @Test
    public void parseTestThree() throws IOException{
        Path fileName = Path.of("test-file3.md");
	    String contents3 = Files.readString(fileName);
        List<String> testerList = List.of();
        assertEquals("this is test3" , testerList.size(), MarkdownParse.getLinks(contents3).size());
    }
}
