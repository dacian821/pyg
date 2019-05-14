package com.pinyougou.shop.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.order.service.OrderService;
import com.pinyougou.pojo.TbOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Reference
    private OrderService orderService;

    /**
     * 根据登录用户查询订单列表
     * @return
     */
    @RequestMapping("/findOrderList")
    public List<TbOrder> findOrderList() {
        String userId = SecurityContextHolder.getContext().getAuthentication().getName();
        List<TbOrder> orderList = orderService.findOrderList(userId);
        return orderList;
    }
}
