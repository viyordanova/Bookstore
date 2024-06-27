public class NonFictionBook extends Book{
    protected String subject;
    public NonFictionBook(String title,String author,String subject,int releaseYear,int totalCopies,double pricePerCopy){
        super(title,author,releaseYear,totalCopies,pricePerCopy);
        this.subject = subject;
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


