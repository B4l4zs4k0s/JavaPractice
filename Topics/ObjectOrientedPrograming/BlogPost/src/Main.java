import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BlogPost blogPost = new BlogPost(
                "John Doe",
                "Lorem Ipsum",
                "Lorem ipsum dolor sit amet.",
                "2000.05.04");
        BlogPost blogPost1 = new BlogPost(
                "Tim Urban",
                "Wait but why",
                "A popular long-form, stick-figure-illustrated blog about almost everything.",
                "2010.10.10");
        BlogPost blogPost2 = new BlogPost(
                "William Turton",
                "One Engineer Is Trying to Get IBM to Reckon With Trump",
                "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.",
                "2017.03.28");

        ArrayList<BlogPost> blogPosts = new ArrayList<>();
        blogPosts.add(blogPost);
        blogPosts.add(blogPost1);
        blogPosts.add(blogPost2);

        for (BlogPost post : blogPosts) {
            post.postBlogDetails();
        }

        Blog blog = new Blog();
        blog.add(blogPost);
        blog.add(blogPost1);
        blog.add(blogPost2);

        BlogPost blogPost3 = new BlogPost(
                "Author",
                "Title",
                "Text",
                "2000.01.01");

        blog.update(2,blogPost3);

        for (int i = 0; i < blog.blogPostList.size(); i++) {
            System.out.println(i+1);
            blog.blogPostList.get(i).postBlogDetails();
        }
    }
}