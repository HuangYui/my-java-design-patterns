package com.hy;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : FishingBoatAdapter
 * @Description: 渔船适配器，由于船长只会划船，需要让渔船也能划
 * @date : 2022/3/10 15:15
 */
public class FishingBoatAdapter implements RowingBoat {

    FishingBoat fishingBoat = new FishingBoat();

    /**
     * 渔船滑动
     */
    @Override
    public void row() {
        fishingBoat.move();
    }
}
