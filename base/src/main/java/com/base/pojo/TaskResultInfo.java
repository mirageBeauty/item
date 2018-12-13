package com.base.pojo;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: XieFei
 * @Date: 2018/12/11
 * @Time: 17:10
 **/
public class TaskResultInfo {
    private Integer id;
    private Integer rightCount;
    private Integer toatl;
    private String accuracy;//正确率

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRightCount() {
        return rightCount;
    }

    public void setRightCount(Integer rightCount) {
        this.rightCount = rightCount;
    }

    public Integer getToatl() {
        return toatl;
    }

    public void setToatl(Integer toatl) {
        this.toatl = toatl;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer numerator,Integer total) {

        double percentage = numerator.doubleValue()/total.doubleValue();
        DecimalFormat format = (DecimalFormat) NumberFormat.getPercentInstance();
        format.applyPattern("00%");
        format.setMaximumFractionDigits(2);
        this.accuracy = format.format(percentage);
    }

    @Override
    public String toString() {
        return "TaskResultInfo{" +
                "id=" + id +
                ", rightCount=" + rightCount +
                ", toatl=" + toatl +
                ", accuracy='" + accuracy + '\'' +
                '}';
    }
}
