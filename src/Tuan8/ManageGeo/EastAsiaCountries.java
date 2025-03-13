package Tuan8.ManageGeo;

public class EastAsiaCountries extends Country implements Comparable<EastAsiaCountries> {
    private String countryTerrain;

    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public EastAsiaCountries() {
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }
    public int compareTo(EastAsiaCountries o) {
        return this.getCountryName().compareTo(o.getCountryName());
    }

    @Override
    public String toString() {
        return super.toString() + ' '+ countryTerrain ;
    }
}
