package Facade;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Facade {
    public String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException {
        try {
            String json = getJsonFromApi(urlString);
            return extractAttributeFromJson(json, attributeName);
        } catch (Exception e) {
            throw new IOException("Error while getting attribute from JSON", e);
        }
    }

    private String getJsonFromApi(String apiUrl) throws Exception {
        URL url = new URL(apiUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            return content.toString();
        } catch (IOException e) {
            throw new IOException("Error while reading JSON from API", e);
        } catch (Exception e) {
            throw new Exception("Error while connecting to API: " + e.getMessage(), e);
        } finally {
            con.disconnect();
        }
    }

    private String extractAttributeFromJson(String json, String attributePath) throws IllegalArgumentException {
        JSONParser parser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject) parser.parse(json);

            // If the attribute exists, return it
            String value = (String) jsonObject.get(attributePath);
            if (value == null) {
                throw new IllegalArgumentException("Attribute '" + attributePath + "' not found in JSON.");
            }
            return value + "\n------------";  // Adding separator for readability
        } catch (ParseException e) {
            throw new IllegalArgumentException("Error while parsing JSON: " + e.getMessage(), e);
        }
    }
}
