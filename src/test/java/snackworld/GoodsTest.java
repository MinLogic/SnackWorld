package test.java.snackworld;

import main.java.snackworld.Goods;
import static org.junit.Assert.*;

import main.java.snackworld.GoodsList;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class GoodsTest {
    GoodsList goodsList = GoodsList.getInstance();

    @Before
    public void before(){
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
}
