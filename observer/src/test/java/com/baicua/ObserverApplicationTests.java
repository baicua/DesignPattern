package com.baicua;

import com.baicua.Data.DisplayEntity;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ObserverApplicationTests {

    @Test
    public void TestWeatherStationRun() {
        ArrayList<DisplayEntity> displayEntities = new ArrayList<>();
        displayEntities.add(new DisplayEntity(1, 2));
        displayEntities.add(new DisplayEntity(1, 12));
        displayEntities.add(new DisplayEntity(3, 2));
        WeatherStation station = new WeatherStation();
        for (DisplayEntity displayEntity : displayEntities) {
            station.run(displayEntity);
            assertEquals("实时温度：" + displayEntity.getTemperation() +"，实时湿度："+ displayEntity.getHumidity() +"",
                    station.observer.displayedInfo);
        }


    }

}

