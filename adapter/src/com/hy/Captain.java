package com.hy;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : Captain
 * @Description: 假如有一个船长他只会划船，但不会航行。
 * @date : 2022/3/10 15:01
 */
public class Captain {

    /**
     * 划艇
     */
    private RowingBoat rowingBoat;

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    /**
     * 划动
     */
    public void move() {
        rowingBoat.row();
    }
}
