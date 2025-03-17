package Tuan8.ManageGeo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class CountryDB {
    MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
    MongoDatabase database = mongoClient.getDatabase("GeoDB");

    public void insertCountry(EastAsiaCountries country){
        Document c = new Document("countryCode", country.getCountryCode())
                .append("countryName", country.getCountryName())
                .append("totalArea", country.getTotalArea())
                .append("countryTerrain", country.getCountryTerrain());
        database.getCollection("Country").insertOne(c);
    }

    public List<EastAsiaCountries> getAllCountries(){
        List<EastAsiaCountries> countries = new ArrayList<>();
        for (Document c : database.getCollection("Country").find()){
            EastAsiaCountries country = new EastAsiaCountries();
            country.setCountryCode(c.getString("countryCode"));
            country.setCountryName(c.getString("countryName"));
            country.setTotalArea(c.getDouble("totalArea").floatValue());
            country.setCountryTerrain(c.getString("countryTerrain"));
            countries.add(country);
        }
        return countries;
    }

    public List<EastAsiaCountries> getCountryByName(String name){
        List<EastAsiaCountries> countries = new ArrayList<>();
        for (Document c : database.getCollection("Country").find(new Document("countryName", name))){
            EastAsiaCountries country = new EastAsiaCountries();
            country.setCountryCode(c.getString("countryCode"));
            country.setCountryName(c.getString("countryName"));
            country.setTotalArea(c.getDouble("totalArea").floatValue());
            country.setCountryTerrain(c.getString("countryTerrain"));
            countries.add(country);
        }
        return countries;
    }
}
