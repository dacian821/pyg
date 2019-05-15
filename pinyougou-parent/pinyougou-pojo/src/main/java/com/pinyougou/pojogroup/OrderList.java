package com.pinyougou.pojogroup;

import com.pinyougou.pojo.TbGoods;
import com.pinyougou.pojo.TbOrder;
import com.pinyougou.pojo.TbOrderItem;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class OrderList implements Serializable{
    private TbOrder order;
    private List<TbOrderItem> orderItemList;
    private Map<Long,TbGoods> orderItemGoods;

    public TbOrder getOrder() {
        return order;
    }

    public void setOrder(TbOrder order) {
        this.order = order;
    }

    public List<TbOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<TbOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public Map<Long, TbGoods> getOrderItemGoods() {
        return orderItemGoods;
    }

    public void setOrderItemGoods(Map<Long, TbGoods> orderItemGoods) {
        this.orderItemGoods = orderItemGoods;
    }
}
