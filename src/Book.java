public class Book {
    private String id;
    private String author;
    private String title;
    private String genre;
    private String price;
    private String published_date;
    private String description;

    public Book() {
    }



    public Book(String id,String author, String title, String gener, String price, String published_date, String description) {
        this.id = id;
        this.author=author;
        this.title = title;
        this.genre = gener;
        this.price = price;
        this.published_date = published_date;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book info => " +
                "id='" + id + '\'' +"\n"+
                ", author='"+author+'\'' +"\n"+
                ", title='" + title + '\'' +"\n"+
                ", genre='" + genre + '\'' +"\n"+
                ", price=" + price +"\n"+
                ", published_date=" + published_date +"\n"+
                ", description='" + description + '\'' +
                '}';
    }
}
