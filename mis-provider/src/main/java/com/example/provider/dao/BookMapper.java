package com.example.provider.dao;

import com.example.provider.bean.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends MisBaseMapper<Book>{
}
