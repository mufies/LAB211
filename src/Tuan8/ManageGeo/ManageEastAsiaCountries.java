package Tuan8.ManageGeo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class ManageEastAsiaCountries {
    CountryDB db = new CountryDB();

    public boolean addCountry(EastAsiaCountries country) {
        List<EastAsiaCountries> countries = db.getAllCountries();
        for(EastAsiaCountries c : countries) {
            if(c.getCountryCode().equals(country.getCountryCode())) {
                return false;
            }
        }
        db.insertCountry(country);
        return true;

    }

    public void displayCountry(List<EastAsiaCountries> countries) {
        if(countries == null) {
            System.out.println("No data found");
            return;
        }
        System.out.printf("%-5s | %-15s | %-12s | %-10s%n", "ID", "Name", "Total Area", "Terrain");
        for(EastAsiaCountries c : countries) {
            System.out.printf("%-5s | %-15s | %-12s | %-10s%n", c.getCountryCode(), c.getCountryName(), c.getTotalArea(), c.getCountryTerrain());
        }
    }


    public void searchCountry(String name) {
        displayCountry(db.getCountryByName(name));
    }

    public List<EastAsiaCountries> getCountryList() {
        return db.getAllCountries();
    }

    public void sortByName() {
        List<EastAsiaCountries> countries = db.getAllCountries();
        Collections.sort(countries);
        displayCountry(countries);
    }



}
