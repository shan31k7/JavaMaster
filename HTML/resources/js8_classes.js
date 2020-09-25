class Country {
    // constructor is mandatory
    Country(name, population, flag) {
        this.name = name;
        this.population = population;
        this.flag = flag;
    }

    enforceLaws() {
        console.log('Creating and Enforcing laws');
    }

    collectTaxes(income) {
        console.log('Collecting taxes');
        return income * .3;
    }
}

// creating object
country = new Country('India', 1000000000, 'TriColor');
country.enforceLaws();

let netTax = country.collectTaxes(100000);
console.log(netTax);
