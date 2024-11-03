package software.ulpgc.kata2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface TitleReader {

    List<Title> read() throws IOException;
}
