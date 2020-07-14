package com.film.dao;

import com.film.pojo.Cinema;
import com.film.pojo.Video;

import java.util.List;

public interface IVideoDao {
    //添加用户
    int add(Video video);
    //查询用户
    Cinema get(int id);
    //删除用户
    int delete(int id);
    //修改用户
    int update(Video video);
    //查看所有用户
    List<Video> list();
}
