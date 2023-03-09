package seminarOneR;


import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Product> goods = new ArrayList<>();
        ArrayList<HotWater> hotGoods = new ArrayList<>();
        Product coca = new Product("Coca-Cola", 84);
        Product pepsi = new Product("Pepsi-Cola", 79);
        Product mirinda = new Product("Mirinda", 69);
        goods.add(coca);
        goods.add(pepsi);
        goods.add(mirinda);

        HotWater freeInOne = new HotWater("cofe", 100, "3+1", 400, 40);
        HotWater tea = new HotWater("blackTea", 60, "black", 350, 55);
        HotWater green = new HotWater("greenTea", 70, "green", 350, 55);
        HotWater americano = new HotWater("cofe", 120, "americano", 400, 40);
        hotGoods.add(freeInOne);
        hotGoods.add(tea);
        hotGoods.add(green);
        hotGoods.add(americano);


        System.out.println(goods);
        System.out.println(hotGoods);
//        добавляем новый продукт в список продуктов обычного автомата
        VendingAutomat.initProducts(goods);
//        поиск продукта в списке и вывод его цены в обычном автомате
        VendingAutomat.getProduct(goods);

//        добавляем новый продукт в список продуктов автомата горячих напитков
        HotVendingAutomate.initProducts(hotGoods);
//        поиск продукта в списке и вывод его цены в автомате горячих напитков
        HotVendingAutomate.getProduct(hotGoods);

    }
}
