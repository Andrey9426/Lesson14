public class Book implements Cloneable {
    private String name;
    private Author author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author.getName();
    }

    public void setAuthor(String s) {
        author.setName(s);
    }

     public Book(String name, String author)  {

        this.name = name;
        this.author = new Author(author);
    }
    public String toString(){
        return "Книга"+ name + " (автор " + author + ")";
    }


        public Book clone() throws CloneNotSupportedException{
        Book newBook = (Book) super.clone();
        newBook.author =(Author) author.clone();

        return newBook;
    }

}




class Author implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author(String name) {

        this.name = name;
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Book b = new Book("War and peac","Leo Tolstoy");
        Book b2 = b.clone();
        b2.setAuthor("Ivan Turgenev");
        System.out.println(b2.getAuthor());
        System.out.println(b.getAuthor());

    }
}



