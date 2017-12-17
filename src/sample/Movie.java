package sample;

public class Movie {
    private String name;
    private int productionYear;
    private String countryOfOrigin;
    private int budget;

    public Movie(String name, int productionYear, String countryOfOrigin, int budget) {
        this.name = name;
        this.productionYear = productionYear;
        this.countryOfOrigin = countryOfOrigin;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public int getBudget() {
        return budget;
    }
}
