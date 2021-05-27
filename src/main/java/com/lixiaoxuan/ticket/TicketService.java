package com.lixiaoxuan.ticket;

/**
 * @description: 售票服务接口
 * @author lixiaoxuan
 * @date 2021/5/26 11:30
 */
public interface TicketService {

    //售票  
    public void sellTicket();

    //问询  
    public void inquire();

    //退票  
    public void withdraw();
}
