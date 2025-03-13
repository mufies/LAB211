package Tuan8.ManageGeo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class ManageEastAsiaCountries {
    private List<EastAsiaCountries> countries = new ArrayList<>();

    public boolean addCountry(EastAsiaCountries country) {
        for(EastAsiaCountries c : countries) {
            if(c.getCountryCode().equals(country.getCountryCode())) {
                return false;
            }
        }
        countries.add(country);
        return true;

    }

    public void displayCountry(List<EastAsiaCountries> countries) {
        System.out.printf("%-5s | %-15s | %-12s | %-10s%n", "ID", "Name", "Total Area", "Terrain");
        for(EastAsiaCountries c : countries) {
            System.out.printf("%-5s | %-15s | %-12s | %-10s%n", c.getCountryCode(), c.getCountryName(), c.getTotalArea(), c.getCountryTerrain());
        }
    }

    public List<EastAsiaCountries> getCountryList() {
        return countries;
    }

    public void searchCountry(String name) {
        for(EastAsiaCountries c : countries) {
            if(c.getCountryName().toLowerCase().contains(name.toLowerCase())) {
                System.out.printf("%-5s | %-15s | %-12s | %-10s%n", "ID", "Name", "Total Area", "Terrain");
                System.out.printf("%-5s | %-15s | %-12s | %-10s%n", c.getCountryCode(), c.getCountryName(), c.getTotalArea(), c.getCountryTerrain());
                return;
            }
        }
        System.out.println("Not found");
    }

    public void sortByName() {
        Collections.sort(countries);
        displayCountry(countries);
    }



}
