package Utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonFile {
    public static String JsonData(String key) throws IOException, ParseException {
        Object obj=new JSONParser()
                .parse(new FileReader("src/test/resources/Apps_Data/Data.json"));
        JSONObject jsonObject=(JSONObject) obj;
        return (String) jsonObject.get(key);
    }

    public static String UATJsonData(String key) throws IOException, ParseException {
        Object obj=new JSONParser()
                .parse(new FileReader("src/test/resources/Apps_Data/UATData.json"));
        JSONObject jsonObject=(JSONObject) obj;
        return (String) jsonObject.get(key);
    }
}
