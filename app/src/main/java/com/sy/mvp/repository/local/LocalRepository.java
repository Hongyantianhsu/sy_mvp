package com.sy.mvp.repository.local;

import com.sy.mvp.repository.Data;
import com.sy.mvp.repository.IDataSource;

import java.util.List;

/**
 * Created by huolala-sunyan on 2018/9/3.
 */

public class LocalRepository implements IDataSource<Data> {
    @Override
    public void add(Data data) {

    }

    @Override
    public void delete(Data data) {

    }

    @Override
    public void update(Data data) {

    }

    @Override
    public List<Data> queryAll() {
        return null;
    }

    @Override
    public Data queryById(int id) {
        return null;
    }
}
