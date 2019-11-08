package com.cab.usercenter.mapper;

/**
 * @author chenanbang
 * @version 1.0.0
 * @ClassName BaseMapper.java
 * @Description TODO
 * @createTime 2019年11月08日 20:20:00
 */
public interface BaseMapper<T> {

  int insert(T t);

  int deleteById(Long id);

  int updateById(T t);

  T selectById(Long id);

}
