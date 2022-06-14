package oop;


public class OOPLecture {
    public static void main(String[] args) {
        Post post = new Post();
        Post post2 = post;
//        System.out.println("post = " + post);
        System.out.println("post2 = " + post2);
        System.out.println("post = " + post);

        post2.setAuthor("Justin");
        System.out.println("post.author = " + post.getAuthor());

        Post post3 = new Post("book title","first Last","11/01/1987","yes!");
        Post post4 = new Post("book xxx title","first Lasdast","11/02/1987","yes!");
        Post post5 = new Post("book xxx asdftitle","asdfasdf Last","11/01/1987","yes!");

        System.out.println("post3.author + post3.title = " + post3.getAuthor() + post3.getTitle());

        System.out.println("post3.toString() = " + post3);

        // static method
        System.out.println("Post.getTotalPosts() = " + Post.getTotalPosts());

        // Post.getTotalPosts()  == post3.getTotalPosts();

        System.out.println("post3 = " + post3);
        System.out.println("post4 = " + post4);
        System.out.println("post5 = " + post5);

        Post post6 = new Post();

        System.out.println("tottal posts = " + post6.getTotalPosts());

//        Post.getTitle();
        Post post7 = new Post();

    }
}
