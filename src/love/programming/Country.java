package love.programming;

public class Country {
    String ContineneName;

    String CountryName;
    long noOfPopulation;
    double gdpVauleCountry;

    public Country(){

    }
    public Country(String contineneName ){
        System.out.println("Continene Name: "+contineneName );


    }
    public Country( String contineneName,String countryName){
        System.out.println("Continene Name: "+contineneName );
System.out.println( "country name :" + countryName);

    }
    public Country( String contineneName,String countryName,long noOfPopulation ){
        System.out.println("Continene Name: "+contineneName );
        System.out.println( "country name :" + countryName);
        System.out.println( "no of Population :" +noOfPopulation );

    }
    public Country( String contineneName,String countryName,long noOfPopulation,double gdpVauleCountry){
        System.out.println( "Name of Continent name =: " + contineneName);
        System.out.println("Name of Country name =: "+countryName );
        System.out.println("No of Population is =: " + noOfPopulation );
        System.out.println( "Gdp Value is = :" + gdpVauleCountry );


    }
}
