import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blogPostList = new ArrayList<>();

    public void add(BlogPost blogPost) {
        blogPostList.add(blogPost);
    }

    public void delete(int index) {
        blogPostList.remove(index);
    }

    public void update(int index, BlogPost blogPost) {
        blogPostList.remove(index);
        blogPostList.add(index,blogPost);
    }
}
