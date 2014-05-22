package org.whut.busmanagement.business.bus.entity;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-22
 * Time: 下午2:31
 * To change this template use File | Settings | File Templates.
 */
public class Bus {

      private long id;

      private String number;

      private String status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
