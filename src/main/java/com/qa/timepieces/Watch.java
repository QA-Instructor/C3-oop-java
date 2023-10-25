package com.qa.timepieces;

import com.qa.Alarmable;

public class Watch implements Alarmable {
    @Override
    public String turnAlarmOn() {
        return "Watch alarm is set";
    }

    @Override
    public String turnAlarmOff() {
        return "Watch alarm is now turned off";
    }

    @Override
    public String snoozeAlarm() {
        return Alarmable.super.snoozeAlarm();
    }
}
