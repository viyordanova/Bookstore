public class Main {
    public static void main(String[] args){
        FictionBook book1 = new FictionBook("Viki","Viktoria","horror",2003,100,19.99);
        NonFictionBook book2 = new NonFictionBook("Veli","Velislav","witches",2023,10,15.99);

        try{
            book1.sellBook(50);
            System.out.println("50 book are sold!");
        }catch(OutOfStockException e){
            System.out.println(e.getMessage());
        }

        try{
            book2.sellBook(11);
            System.out.println("5 book are sold!");
        }catch(OutOfStockException e){
            System.out.println(e.getMessage());
        }
    }
}
