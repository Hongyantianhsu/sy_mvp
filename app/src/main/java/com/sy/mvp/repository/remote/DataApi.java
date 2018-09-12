package com.sy.mvp.repository.remote;

import com.google.gson.Gson;
import com.sy.mvp.repository.BaseEntity;
import com.sy.mvp.repository.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huolala-sunyan on 2018/9/3.
 */

public class DataApi {
    private List<Data> dataList = new ArrayList<>();

    private DataApi(){}

    public static final class SingleTon{
        private static final DataApi INSTANCE = new DataApi();
    }

    public static DataApi get(){
        return SingleTon.INSTANCE;
    }

    public Data getData(){
        //网络请求获取数据
        BaseEntity<String> entity = new BaseEntity<>();
        String str = "'name':sunyan,'age':'25'";
        entity.setRet(0);
        entity.setMsg("");
        entity.setData(str);

        Data data = new Data();
        data.id = 0;
        data.msg = new Gson().toJson(entity);
        return data;
    }

    public boolean add(Data data){
        return dataList.add(data);
    }

    public boolean delete(Data data){
        return dataList.remove(data);
    }

    public boolean update(Data data){
        if (dataList.contains(data)){
            dataList.remove(data);
            dataList.add(data);
        } else {
            dataList.add(data);
        }
        return true;
    }

    public List<Data> queryAll(){
        return null;
    }
}
