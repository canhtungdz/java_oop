package hus.oop.lab8.exercise4.ex3;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i-1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population 
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            // Find the index of the minimum element in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() < newArray[minIndex].getPopulation()) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of unsorted part
            if (i != minIndex) {
                Country temp = newArray[i];
                newArray[i] = newArray[minIndex];
                newArray[minIndex] = temp;
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population 
     *  using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() > newArray[maxIndex].getPopulation()) {
                    maxIndex = j;
                }
            }
            if (i != maxIndex) {
                Country temp = newArray[i];
                newArray[i] = newArray[maxIndex];
                newArray[maxIndex] = temp;
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() > newArray[j + 1].getArea()) {
                    // Swap elements if they are in the wrong order
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() < newArray[j + 1].getArea()) {
                    // Swap elements if they are in the wrong order
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < newArray.length; i++) {
            Country current = newArray[i];
            int j = i - 1;

            // Shift elements of newArray[0..i-1], that are greater than current
            while (j >= 0 && newArray[j].getGdp() > current.getGdp()) {
                newArray[j + 1] = newArray[j];
                j--;
            }
            // Insert the current element at its correct position
            newArray[j + 1] = current;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  sing insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < newArray.length; i++) {
            Country current = newArray[i];
            int j = i - 1;

            // Shift elements of newArray[0..i-1], that are greater than current
            while (j >= 0 && newArray[j].getGdp() < current.getGdp()) {
                newArray[j + 1] = newArray[j];
                j--;
            }
            // Insert the current element at its correct position
            newArray[j + 1] = current;
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        int numberAfrica = 0;
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                numberAfrica++;
            }
        }
        AfricaCountry[] africaCountries = new AfricaCountry[numberAfrica];
        int i = 0;
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                africaCountries[i] = (AfricaCountry)country;
                i++;
            }
        }
        return africaCountries;
    }

    public AsiaCountry[] filterAsiaCountry() {
        int numberAsia = 0;
        for (Country country : countries) {
            if (country instanceof AsiaCountry) {
                numberAsia++;
            }
        }
        AsiaCountry[] asiaCountries = new AsiaCountry[numberAsia];
        int i = 0;
        for (Country country : countries) {
            if (country instanceof AsiaCountry) {
                asiaCountries[i] = (AsiaCountry) country;
                i++;
            }
        }
        return asiaCountries;
    }

    public EuropeCountry[] filterEuropeCountry() {
        int numberEurope = 0;
        for (Country country : countries) {
            if (country instanceof EuropeCountry) {
                numberEurope++;
            }
        }
        EuropeCountry[] europeCountries = new EuropeCountry[numberEurope];
        int i = 0;
        for (Country country : countries) {
            if (country instanceof EuropeCountry) {
                europeCountries[i] = (EuropeCountry) country;
                i++;
            }
        }
        return europeCountries;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        int numberNorthAmerica = 0;
        for (Country country : countries) {
            if (country instanceof NorthAmericaCountry) {
                numberNorthAmerica++;
            }
        }
        NorthAmericaCountry[] northAmericaCountries = new NorthAmericaCountry[numberNorthAmerica];
        int i = 0;
        for (Country country : countries) {
            if (country instanceof NorthAmericaCountry) {
                northAmericaCountries[i] = (NorthAmericaCountry) country;
                i++;
            }
        }
        return northAmericaCountries;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        int numberOceania = 0;
        for (Country country : countries) {
            if (country instanceof OceaniaCountry) {
                numberOceania++;
            }
        }
        OceaniaCountry[] oceaniaCountries = new OceaniaCountry[numberOceania];
        int i = 0;
        for (Country country : countries) {
            if (country instanceof OceaniaCountry) {
                oceaniaCountries[i] = (OceaniaCountry) country;
                i++;
            }
        }
        return oceaniaCountries;
    }

    public Country[] filterSouthAmericaCountry() {
        int numberSouthAmerica = 0;
        for (Country country : countries) {
            if (country instanceof SouthAmericaCountry) {
                numberSouthAmerica++;
            }
        }
        SouthAmericaCountry[] southAmericaCountries = new SouthAmericaCountry[numberSouthAmerica];
        int i = 0;
        for (Country country : countries) {
            if (country instanceof SouthAmericaCountry) {
                southAmericaCountries[i] = (SouthAmericaCountry) country;
                i++;
            }
        }
        return southAmericaCountries;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] newArray = sortByDecreasingPopulation();
        Country[] mostPopulousCountries = new Country[howMany];
        System.arraycopy(newArray, 0, mostPopulousCountries, 0, howMany);
        return mostPopulousCountries;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] newArray = sortByIncreasingPopulation();
        Country[] leastPopulousCountries = new Country[howMany];
        System.arraycopy(newArray, 0, leastPopulousCountries, 0, howMany);
        return leastPopulousCountries;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] newArray = sortByDecreasingArea();
        Country[] largestAreaCountries = new Country[howMany];
        System.arraycopy(newArray, 0, largestAreaCountries, 0, howMany);
        return largestAreaCountries;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] newArray = sortByIncreasingArea();
        Country[] smallestAreaCountries = new Country[howMany];
        System.arraycopy(newArray, 0, smallestAreaCountries, 0, howMany);
        return smallestAreaCountries;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] newArray = sortByDecreasingGdp();
        Country[] highestGdpCountries = new Country[howMany];
        System.arraycopy(newArray, 0, highestGdpCountries, 0, howMany);
        return highestGdpCountries;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] newArray = sortByIncreasingGdp();
        Country[] lowestGdpCountries = new Country[howMany];
        System.arraycopy(newArray, 0, lowestGdpCountries, 0, howMany);
        return lowestGdpCountries;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }
        
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
