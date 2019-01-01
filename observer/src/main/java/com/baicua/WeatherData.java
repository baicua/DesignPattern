package com.baicua;

import com.baicua.Data.DisplayEntity;
import com.baicua.Interface.Observer;
import com.baicua.Interface.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：xutong
 * @ Date       ：Created in 5:55 PM 2018/12/31
 * @ Description：${description}
 * @ Modified By：
 */
public class WeatherData implements Subject {
    private List<Observer> obList = new ArrayList<>();
    private DisplayEntity entity = new DisplayEntity();
    @Override
    public void registerObserver(Observer o) {
        obList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        obList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : obList) {
            observer.update(entity);
        }
    }

    private void measurementsChange(){
        notifyObservers();
    }

    public void setDisplayEntity(DisplayEntity displayEntity){
        entity.setHumidity(displayEntity.getHumidity());
        entity.setTemperation(displayEntity.getTemperation());
        measurementsChange();
    }
}
