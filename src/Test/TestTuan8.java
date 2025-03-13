package Test;

import Tuan8.ManageGeo.EastAsiaCountries;
import Tuan8.ManageGeo.ManageEastAsiaCountries;

import java.util.ArrayList;
import java.util.List;

public class TestTuan8 {
    public static void main(String[] args) {
        InputData input = new InputData();
        ManageEastAsiaCountries m = new ManageEastAsiaCountries();
        while (true)
        {
            System.out.println("MENU");
            System.out.println("1. Input the information of 11 countries in East Asia");
            System.out.println("2. Display the information of country you've just input");
            System.out.println("3. Search the information of country by user-entered name");
            System.out.println("4. Display the information of countries sorted name in ascending order");
            System.out.println("5.Exit");
            System.out.println("Enter your choice: ");
            int choice = input.getInt();
            switch (choice)
            {
                case 1->
                {
                    System.out.println("Enter country code: ");
                    String countryCode = input.getString();
                    System.out.println("Enter country name: ");
                    String countryName = input.getString();
                    System.out.println("Enter total area: ");
                    float totalArea = input.getFloat();
                    System.out.println("Enter country terrain: ");
                    String countryTerrain = input.getString();
                    m.addCountry(new EastAsiaCountries(countryCode, countryName, totalArea, countryTerrain));

                }
                case 2->
                {
                    List<EastAsiaCountries> countries = new ArrayList<>();
                    countries.add(m.getCountryList().getLast());
                    m.displayCountry(countries);
                }
                case 3->
                {
                    System.out.println("Enter country name: ");
                    String name = input.getString();
                    m.searchCountry(name);
                }
                case 4->
                {
                    m.sortByName();
                }
                case 5-> System.exit(0);
            }

        }
    }
}
