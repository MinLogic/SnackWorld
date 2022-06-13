package test.java.snackworld;

import main.java.snackworld.Cart;
import main.java.snackworld.Goods;
import static org.junit.Assert.*;

import main.java.snackworld.GoodsList;
import main.java.snackworld.Standard;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class GoodsTest {
    GoodsList goodsList = GoodsList.getInstance();
    Cart cart;
    Standard standard;

    @Before
    public void before(){
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
        standard.getStandard();
        standard.setStandard(null, null, null);
    }
}
