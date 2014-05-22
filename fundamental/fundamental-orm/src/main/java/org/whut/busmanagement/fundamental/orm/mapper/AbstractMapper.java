package org.whut.busmanagement.fundamental.orm.mapper;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-22
 * Time: 上午10:37
 * To change this template use File | Settings | File Templates.
 */
public interface AbstractMapper<T> {

    void add (T t);

    void update(T t);

    int delete(T t);

    T get(T t);

    List<T> find(Map<String,Object> conditions);
}
