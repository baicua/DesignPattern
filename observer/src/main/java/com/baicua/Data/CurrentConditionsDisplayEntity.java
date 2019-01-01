package com.baicua.Data;

/**
 * @ Author     ：xutong
 * @ Date       ：Created in 5:24 PM 2018/12/31
 * @ Description：${description}
 * @ Modified By：
 */
public class CurrentConditionsDisplayEntity {
    private float temperation;
    private float humidity;

    public CurrentConditionsDisplayEntity(float temperation, float humidity) {
        this.temperation = temperation;
        this.humidity = humidity;
    }

    public String toString(){
        return "实时温度："+temperation+"，实时湿度："+humidity;
    }
    /**
     * Getter for property 'temperation'.
     *
     * @return Value for property 'temperation'.
     */
    public float getTemperation() {
        return temperation;
    }

    /**
     * Setter for property 'temperation'.
     *
     * @param temperation Value to set for property 'temperation'.
     */
    public void setTemperation(float temperation) {
        this.temperation = temperation;
    }

    /**
     * Getter for property 'humidity'.
     *
     * @return Value for property 'humidity'.
     */
    public float getHumidity() {
        return humidity;
    }

    /**
     * Setter for property 'humidity'.
     *
     * @param humidity Value to set for property 'humidity'.
     */
    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
