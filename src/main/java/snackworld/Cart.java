package main.java.snackworld;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Goods> cartList = new ArrayList<>();

    public List<Goods> getCartList() {
        return cartList;
    }

    public void addCart(Goods goods){
        cartList.add(goods);
    }

    public void orderCartAll(User user){
        // 기준 검사 해야함
        OrderList orderList = OrderList.getOrderList();
        orderList.addOrderList(new Order(user, this.cartList));
    }

    public void orderCartItem(){

    }

    public void deleteCartItem(){

    }
}
