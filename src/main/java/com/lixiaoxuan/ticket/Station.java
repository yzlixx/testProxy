package com.lixiaoxuan.ticket;

/**
 * @author lixiaoxuan
 * @description: 售票服务接口实现类，车站
 * @date 2021/5/26 11:33
 */
public class Station implements TicketService {
    @Override
    public void sellTicket() {
        System.out.println("\n\t售票.....\n");
    }

    @Override
    public void inquire() {
        System.out.println("\n\t问询。。。。\n");
    }

    @Override
    public void withdraw() {
        System.out.println("\n\t退票......\n");
    }
}
