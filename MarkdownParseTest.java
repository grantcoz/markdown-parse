import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test public void testingTestfile() throws IOException{
        ArrayList<String> list = new ArrayList<String>();

        list.add("https://something.com");
        list.add("some-thing.html");

        Path fileName = Path.of("Test/test-file.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), list);

    }

    @Test public void testingTestfile1() throws IOException{
        ArrayList<String> list = new ArrayList<String>();

        Path fileName = Path.of("Test/test-file1.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), list);

    }

    @Test public void testingTestfile2() throws IOException{
        ArrayList<String> list = new ArrayList<String>();

        Path fileName = Path.of("Test/test-file2.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), list);

    }

    @Test public void testingTestfile3() throws IOException{
        ArrayList<String> list = new ArrayList<String>();

        Path fileName = Path.of("Test/test-file3.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), list);

    }

    @Test public void testingTestfile4() throws IOException{
        ArrayList<String> list = new ArrayList<String>();

        list.add("https://something.com");
        list.add("some-page.html");

        Path fileName = Path.of("Test/test-file4.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), list);

    }

    @Test public void testingTestfile5() throws IOException{
        ArrayList<String> list = new ArrayList<String>();

        Path fileName = Path.of("Test/test-file5.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), list);

    }

    @Test public void testingTestfile6() throws IOException{
        ArrayList<String> list = new ArrayList<String>();

        Path fileName = Path.of("Test/test-file6.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), list);

    }

    @Test public void testingTestfile7() throws IOException{
        ArrayList<String> list = new ArrayList<String>();

        Path fileName = Path.of("Test/test-file7.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), list);

    }

    @Test public void testingTestfile8() throws IOException{
        ArrayList<String> list = new ArrayList<String>();

        Path fileName = Path.of("Test/test-file8.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), list);

    }

    @Test public void testingTestfile9() throws IOException{
        ArrayList<String> list = new ArrayList<String>();

        Path fileName = Path.of("Test/test-file9.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), list);

    }

    @Test public void testingTestfile10() throws IOException{
        ArrayList<String> list = new ArrayList<String>();

        Path fileName = Path.of("Test/test-file10.md");
        String content = Files.readString(fileName);
        assertEquals(MarkdownParse.getLinks(content), list);

    }
}