package com.sy.mvp.repository;

import java.util.List;

/**
 * Created by huolala-sunyan on 2018/9/3.
 */

public interface IDataSource<T> {
    void add(T t);

    void delete(T t);

    void update(T t);

    List<T> queryAll();

    T queryById(int id);
}
