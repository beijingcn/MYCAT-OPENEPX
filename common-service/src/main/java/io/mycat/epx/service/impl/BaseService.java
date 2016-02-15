package io.mycat.epx.service.impl;

import io.mycat.epx.service.IService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by Liwh on 2015/12/16.
 */
public abstract class BaseService<T> implements IService<T> {

    @Autowired
    protected Mapper<T> mapper;

    public Mapper<T> getMapper() {
        return mapper;
    }

    @Override
    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }
    @Override
    public int save(T entity) {
        return mapper.insert(entity);
    }
    @Override
    public int delete(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }
    @Override
    public int updateAll(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }
    @Override
    public int updateNotNull(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }
    @Override
    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }
    @Override
    public PageInfo selectByExample(Object example, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<T> list =
         mapper.selectByExample(example);
        return new PageInfo(list);
    }
}
