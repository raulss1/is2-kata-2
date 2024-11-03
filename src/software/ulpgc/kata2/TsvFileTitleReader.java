package software.ulpgc.kata2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TsvFileTitleReader implements TitleReader {

    private final File file;
    private List<Title> titles = new ArrayList<>();

    public TsvFileTitleReader(File file) {
        this.file = file;
    }

    @Override
    public List<Title> read() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        reader.readLine();
        return readWith(reader);
    }

    private List<Title> readWith(BufferedReader reader) throws IOException {
        TsvTitleDeserializer tsvTitleDeserializer = new TsvTitleDeserializer();
        while(true){
            String line = reader.readLine();
            if(line == null) break;
            Title title = tsvTitleDeserializer.deserialize(line);
            titles.add(title);
        }
        return titles;
    }

}
