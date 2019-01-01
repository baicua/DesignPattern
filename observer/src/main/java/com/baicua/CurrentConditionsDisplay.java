package com.baicua;

import com.baicua.Data.CurrentConditionsDisplayEntity;
import com.baicua.Data.DisplayEntity;
import com.baicua.Interface.Display;
import com.baicua.Interface.Observer;
import com.baicua.Interface.Subject;

public class CurrentConditionsDisplay implements Display, Observer {
    private CurrentConditionsDisplayEntity info;
    private Subject subject;
    public String displayedInfo;
    @Override
    public void display() {
        displayedInfo = info.toString();
    }

    protected CurrentConditionsDisplay(Subject subj) {
        this.subject = subj;
        //订阅
        subject.registerObserver(this);
    }

    @Override
    public void update(DisplayEntity thInfo) {
        info = new CurrentConditionsDisplayEntity(thInfo.getTemperation(),thInfo.getHumidity());
        display();
    }
}
