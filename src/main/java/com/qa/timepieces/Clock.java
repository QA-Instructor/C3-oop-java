package com.qa.timepieces;

import com.qa.Alarmable;

public class Clock implements Alarmable {
    @Override
    public String turnAlarmOn() {
        return "The alarm clock is set ON";
    }

    @Override
    public String turnAlarmOff() {
        return "The alarm clock is set OFF";
    }
}
