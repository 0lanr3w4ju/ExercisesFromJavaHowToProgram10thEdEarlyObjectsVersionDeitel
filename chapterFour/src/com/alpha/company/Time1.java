package com.alpha.company;

import java.util.Scanner;

public class Time1 {

        private int hour;
        private int mins;
        private int secs;

        public void setTime(int hour, int mins, int secs) { //sets the time and throws an exception if any of the conditions set is met.
            if (hour < 0 || hour >= 24 || mins < 0 || mins >= 60 || secs < 0 || secs >= 60) {
                throw new IllegalArgumentException("hour, mins or secs was out of range."); //exception here.
            } else {
                this.hour = hour;
                this.mins = mins;
                this.secs = secs;
            }
        }

        public String universalTimeString() { //converts to universal time format of type string.
            return String.format("%02d:%02d:%02d", hour, mins, secs);
        }

        public String standardTimeFormat() { //converts to standard time format of type string.
            return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), mins, secs, ((hour < 12) ? "am" : "pm"));
        }

}
