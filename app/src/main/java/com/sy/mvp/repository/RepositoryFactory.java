package com.sy.mvp.repository;

import com.sy.mvp.repository.local.LocalRepository;
import com.sy.mvp.repository.remote.RemoteRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by huolala-sunyan on 2018/9/3.
 */

public class RepositoryFactory implements IDataSource<Data>{
    private IDataSource<Data> local;
    private IDataSource<Data> remote;
    private Map<String,Data> mCache = new HashMap<>();

    private static volatile RepositoryFactory INSTANCE;

    private RepositoryFactory(IDataSource<Data> local , IDataSource<Data> remote){
        this.local = local;
        this.remote = remote;
    }

    public static RepositoryFactory getInstance(){
        if (INSTANCE == null){
            synchronized (RepositoryFactory.class){
                if (INSTANCE == null){
                    INSTANCE = new RepositoryFactory(new LocalRepository(),new RemoteRepository());
                }
            }
        }
        return INSTANCE;
    }

    public void clear(){
        if (INSTANCE != null)
            INSTANCE = null;
    }

    @Override
    public void add(Data data) {
        local.add(data);
        remote.add(data);
        mCache.put(String.valueOf(data.id),data);
    }

    @Override
    public void delete(Data data) {
        local.delete(data);
        remote.delete(data);
        mCache.remove(String.valueOf(data.id));
    }

    @Override
    public void update(Data data) {
        local.update(data);
        remote.update(data);
        mCache.put(String.valueOf(data.id),data);
    }

    @Override
    public List<Data> queryAll() {
        List<Data> list = local.queryAll();
        if (list.isEmpty()){
            list = remote.queryAll();
        }
        return list;
    }

    @Override
    public Data queryById(int id) {
        Data data = mCache.get(String.valueOf(id));
        if (data == null){
            data = local.queryById(id);
        }
        if (data == null){
            data = remote.queryById(id);
        }
        if (data != null){
            mCache.put(String.valueOf(id),data);
        }
        return data;
    }
}
