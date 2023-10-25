package com.qa;

public interface Alarmable {
    String turnAlarmOn();
    String turnAlarmOff();

    default String snoozeAlarm(){
        return "Alarm is snoozed for 9 minutes";
    }

}
