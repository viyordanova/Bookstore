public abstract class Book {
    protected String title;
    protected String author;
    protected int releaseYear;
    protected int totalCopies;
    protected double pricePerCopy;

    public Book(String title,String author,int releaseYear,int totalCopies,double pricePerCopy){
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.totalCopies = totalCopies;
        this.pricePerCopy = pricePerCopy;
    }

    public abstract boolean sellBook(int num) throws OutOfStockException;
}
