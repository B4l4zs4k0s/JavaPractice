import java.util.Date;

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    public void postBlogDetails() {
        System.out.println(title + (" ") + ("titled by ") +
                authorName + " posted at " + publicationDate + "." + "\r\n" + text);
    }
}

