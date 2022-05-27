package com.kuang.mapper;

import com.kuang.pojo.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //新增一个博客
    int addBlog(Blog blog);
    List<Blog> queryBlogIf(Map map);
    int updateBlog(Map map);
    List<Blog> queryBlogForeach(Map map);
    Blog queryBlogById(@Param("id") Integer id);

}
