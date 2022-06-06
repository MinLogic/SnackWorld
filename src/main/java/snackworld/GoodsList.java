package main.java.snackworld;

import java.util.ArrayList;

public class GoodsList {
    private static GoodsList goodsList = new GoodsList();
    private ArrayList<Goods> itemList = new ArrayList<>();

    private GoodsList(){ }

    public GoodsList getInstance(){
        if(goodsList == null){
            goodsList = new GoodsList();
        }

        return goodsList;
    }
    public void addGoods(Goods goods) {
        itemList.add(goods);
    }

    public ArrayList<Goods> retrieveGoods(String goodsName){
        ArrayList<Goods> retrievedList = new ArrayList<>();
        for(Goods item : itemList){
            String itemName = item.goodsName;
            if(itemName.contains(goodsName)){
                retrievedList.add(item);
            }
        }
        return retrievedList;
    }


    public void deleteGoods(String goodsName){
        for(Goods item : itemList){
            String itemName = item.goodsName;
            if(itemName.equals(goodsName)){
                itemList.remove(item);
            }
        }
    }

    public void getGoods(String goodsName) {

    }
}
