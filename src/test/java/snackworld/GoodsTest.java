package test.java.snackworld;

import main.java.snackworld.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsTest {
    GoodsList goodsList = GoodsList.getInstance();
    Cart cart;
    Standard standard;
    OrderList orderList;

    @Before
    public void before(){
        orderList = OrderList.getOrderList();
        cart = new Cart();
        cart.addCart(new Goods("itemA", 3000));
        cart.addCart(new Goods("itemA", 3000));
        cart.addCart(new Goods("itemB", 3000));
        cart.addCart(new Goods("itemC", 3000));
        goodsList.addGoods(new Goods("itemA", 3000));
        goodsList.addGoods(new Goods("itemB", 3000));
        goodsList.addGoods(new Goods("itemC", 3000));
        goodsList.addGoods(new Goods("itemD", 3000));
    }

    @Test
    public void testGoods(){
        Goods goods = new Goods("itemA", 1234);
        assertEquals("itemA", goods.getGoodsName());
    }

    @Test
    public void testAddGoods(){
        ArrayList<Goods> list = new ArrayList<Goods>();
        list.add(new Goods("itemA", 1234));
        for(Goods item : list){
            assertTrue("itemA".equals(item.getGoodsName()));
        }
    }

    @Test
    public void testDeleteGoods(){
        assertEquals(4, goodsList.countGoodsList());
        goodsList.deleteGoods("itemA");
        goodsList.deleteGoods("itemB");
        goodsList.deleteGoods("itemC");
        assertEquals(1, goodsList.countGoodsList());
    }

    @Test
    public void testTest(){
        Goods goods = goodsList.retrieveGoods("itemA");
        List<Goods> cartList = cart.getCartList();
        User user = new CommonUser();
        int index = cartList.indexOf(goods);
        if(index == -1){
            System.out.println("메시지");
            return;
        }
        orderList.addOrderList(new Order(user, (List<Goods>) cartList.get(index)));
    }
}
