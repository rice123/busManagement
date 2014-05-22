package org.whut.busmanagement.business.bus.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.whut.busmanagement.business.bus.entity.Bus;
import org.whut.busmanagement.business.bus.service.BusService;
import org.whut.busmanagement.fundamental.util.json.JsonResultUtils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-22
 * Time: 下午2:26
 * To change this template use File | Settings | File Templates.
 */
@Component
@Path("/bus")
public class BusServiceWeb {
    @Autowired
    private BusService busService;

    @Produces(MediaType.APPLICATION_JSON+";charset=UTF-8")
    @GET
    @Path("/getBusInfoById/{id}")
    public String getBusInfoById(@PathParam("id") String id){
        List<Bus> list=busService.getBusInfoById(Long.parseLong(id));
        return JsonResultUtils.getObjectResultByStringAsDefault(list, JsonResultUtils.Code.SUCCESS);
    }
}
