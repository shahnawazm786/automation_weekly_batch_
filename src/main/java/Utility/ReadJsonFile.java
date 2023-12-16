package Utility;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadJsonFile {
    public static JsonObject jsonObject(String key) throws FileNotFoundException {
        JsonParser parse=new JsonParser();
        JsonObject data=(JsonObject) parse
                .parse(new FileReader("src/test/resources/Apps_Data/Data.json"));
         return (JsonObject)data.get(key);
    }
}
