import org.codehaus.jackson.map.ObjectMapper;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        FileReader file = new FileReader("src/main/resources/Integer.json");
        Automat automat = mapper.readValue(file, Automat.class);

        automat.max("-213eq", 0).Print();
    }
}
