public class FictionBook extends Book{
    protected String genre;
    public FictionBook(String title,String author,String genre,int releaseYear,int totalCopies,double pricePerCopy){
        super(title,author,releaseYear,totalCopies,pricePerCopy);
        this.genre = genre;
    }

    @Override
    public boolean sellBook(int num) throws OutOfStockException {
        if (this.totalCopies >= num) {
            this.totalCopies -= num;
            return true;
        } else {
            throw new OutOfStockException("No more copies!");
        }
    }
}
