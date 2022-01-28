
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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
}
