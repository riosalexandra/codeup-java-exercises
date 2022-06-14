package oop;

public class Post {

    private String title;
    private String author;
    private String creationDate;
    private String body;

    private static long totalPosts;

    public Post() {
        totalPosts++;
        if(totalPosts > 5) System.out.println("More than 5 posts!");
    }
    public Post(String title, String author, String creationDate, String body) {
        this();
        this.title = title;
        this.author = author;
        this.creationDate = creationDate;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public Post setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Post setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public Post setCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public String getBody() {
        return body;
    }

    public Post setBody(String body) {
        this.body = body;
        return this;
    }

    public static long getTotalPosts() {
        return totalPosts;
    }

    public static void setTotalPosts(long totalPosts) {
        Post.totalPosts = totalPosts;
    }


}
