/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author husse
 */
public class PreviousFlight {
    private String departurePlace;
    private String arrivalPlace;
    private short type;
    private short classType;
    private Date dateTime;
    private float cost;
    private Date approximateTime;

    public static final short ONE_WAY = 0;
    public static final short ROUND_TRIP = 1;

    public static final short ECONOMICAL = 0;
    public static final short FIRST_CLASS = 1;
    public static final short VIP = 2;

    public String getDeparturePlace() {
        return departurePlace;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    public String getArrivalPlace() {
        return arrivalPlace;
    }

    public void setArrivalPlace(String arrivalPlace) {
        this.arrivalPlace = arrivalPlace;
    }

    /**
     * @return
     */
    public short getType() {
        return type;
    }

    /**
     * @param type - Possible values are (ONE_WAY, ROUND_TRIP)
     */
    public void setType(short type) {
        this.type = type;
    }

    /**
     * @return - Possible values are: (ECONOMICAL = 0, FIRST_CLASS = 1, VIP = 2)
     */
    public short getClassType() {
        return classType;
    }

    /**
     * @param classType - Possible values are (ECONOMICAL, FIRST_CLASS, VIP)
     */
    public void setClassType(short classType) {
        this.classType = classType;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Date getApproximateTime() {
        return approximateTime;
    }

    public void setApproximateTime(Date approximateTime) {
        this.approximateTime = approximateTime;
    }

    public PreviousFlight() {
        this.departurePlace = "";
        this.arrivalPlace = "";
        this.type = -1;
        this.classType = -1;
        this.dateTime = null;
        this.cost = 0;
        this.approximateTime = null;
    }

    public PreviousFlight(PreviousFlight prevFlight) {
        this.departurePlace = prevFlight.departurePlace;
        this.arrivalPlace = prevFlight.arrivalPlace;
        this.type = prevFlight.type;
        this.classType = prevFlight.classType;
        this.dateTime = prevFlight.dateTime;
        this.cost = prevFlight.cost;
        this.approximateTime = prevFlight.approximateTime;
    }

    /**
     * @param departurePlace  - String representing departure airport
     * @param arrivalPlace    - String representing arrival airport
     * @param type            - Possible values are (ONE_WAY, ROUND_TRIP)
     * @param classType       - Possible values are (ECONOMICAL, FIRST_CLASS, VIP)
     * @param dateTime        - Date object for flight date & time
     * @param cost            - Float value for flight ticket cost
     * @param approximateTime - Date object for flight approximate time length
     */
    public PreviousFlight(String departurePlace, String arrivalPlace, short type,
            short classType, Date dateTime, float cost, Date approximateTime) {
        this.departurePlace = departurePlace;
        this.arrivalPlace = arrivalPlace;
        this.type = type;
        this.classType = classType;
        this.dateTime = dateTime;
        this.cost = cost;
        this.approximateTime = approximateTime;
    }
}
