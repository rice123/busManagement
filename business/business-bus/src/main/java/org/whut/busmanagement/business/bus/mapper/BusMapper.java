package org.whut.busmanagement.business.bus.mapper;

import org.whut.busmanagement.business.bus.entity.Bus;
import org.whut.busmanagement.fundamental.orm.mapper.AbstractMapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-22
 * Time: 下午2:31
 * To change this template use File | Settings | File Templates.
 */
public interface BusMapper extends AbstractMapper<Bus>{
    public List<Bus> getBusInfoById(long id);
}
