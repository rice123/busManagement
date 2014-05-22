package org.whut.busmanagement.business.bus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.whut.busmanagement.business.bus.entity.Bus;
import org.whut.busmanagement.business.bus.mapper.BusMapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-22
 * Time: 下午2:31
 * To change this template use File | Settings | File Templates.
 */
public class BusService {
    @Autowired
    private BusMapper mapper;
    public List<Bus> getBusInfoById(long id){
        return mapper.getBusInfoById(id);
    }
}
