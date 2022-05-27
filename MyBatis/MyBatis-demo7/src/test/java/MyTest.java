import com.kuang.mapper.BlogMapper;
import com.kuang.pojo.Blog;
import com.kuang.utils.IDUtils;
import com.kuang.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class MyTest {
    @Test
    public void getUUID() {
        System.out.println(IDUtils.genId());
        System.out.println(IDUtils.genId());
        System.out.println(IDUtils.genId());
        System.out.println(IDUtils.genId());
        System.out.println(IDUtils.genId());
    }

    @Test
    public void addInitBlog() {
        SqlSession session = MyBatisUtils.getSession(true);
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtils.genId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBlog(blog);

        blog.setId(IDUtils.genId());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);

        blog.setId(IDUtils.genId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);
        blog.setId(IDUtils.genId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);

        session.close();
    }

    @Test
    public void queryBlogIf(){
        SqlSession session = MyBatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Map<String,String> map =new HashMap();
//        map.put("title","Mybatis如此简单");
        map.put("author","狂神说");
        List<Blog> blogs = mapper.queryBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }

    @Test
    public void updateBlog(){
        SqlSession session = MyBatisUtils.getSession(true);
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Map<String,String> map =new HashMap();
        map.put("title","如何学好Java");
        map.put("id","42b1c49e642e4d3086b895d3cac7f144");
        mapper.updateBlog(map);
        session.close();
    }

    @Test
    public void queryBlogForeach(){
        SqlSession session = MyBatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Map map =new HashMap();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        map.put("ids",ids);
        List<Blog> blogs = mapper.queryBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }

    @Test
    public void queryBlogById(){
        SqlSession session = MyBatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Blog blog = mapper.queryBlogById(1);
        System.out.println(blog);
//        session.close();
        Blog blog2 = mapper.queryBlogById(1);
        System.out.println(blog2);
        System.out.println(blog==blog2);
        session.close();
    }

    @Test
    public void queryBlogById2(){
        SqlSession session = MyBatisUtils.getSession();
        SqlSession session2 = MyBatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        BlogMapper mapper2 = session2.getMapper(BlogMapper.class);
        Blog blog = mapper.queryBlogById(1);
        System.out.println(blog);
        session.close();
        Blog blog2 = mapper2.queryBlogById(1);
        System.out.println(blog2);
        System.out.println(blog==blog2);
        session2.close();
    }
}
