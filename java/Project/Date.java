/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author HP
 */
public class Date {
        private int day;
    private int mon;
    private int year;

    public Date() {
        day = mon = year = 0;
    }

    public Date(int day, int mon, int year) {
        this.day = day;
        this.mon = mon;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMon(int mon) {
        this.mon = mon;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int d, int m, int y) {
        this.day = d;
        this.mon = m;
        this.year = y;
    }
    
    public int getDay() {
        return day;
    }

    public int getMon() {
        return mon;
    }

    public int getYear() {
        return year;
    }
}
