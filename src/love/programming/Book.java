package love.programming;

public class Book {
    String bookGenere;
    String bookName;
    int noOfPages;

    public Book(){

    }
public Book (String bookGenere ){
    System.out.println("value of bookGenere is: "+bookGenere);

}
public Book( String bookGenere, String bookName ){
    System.out.println("Name of bookGenere is: "+bookGenere );
    System.out.println("Name of Book " +bookName );

}
public Book( String bookGenere, String bookName, int noOfPages ){

    System.out.println("Name of bookGenere=: "+bookGenere );
    System.out.println("Name of Book= " +bookName );
    System.out.println("Number of page=" +noOfPages );
}
}
