package com.iiuc.transport.model;

/**
 * Bus Model Class
 * Represents a university bus entity with all required attributes.
 */
public class Bus {

    private Long id;
    private String busNumber;
    private String routeName;
    private String driverName;
    private Integer capacity;
    private String schedule;
    private String semester;

    // ─── Constructors ───────────────────────────────────────────────────────────

    public Bus() {}

    public Bus(Long id, String busNumber, String routeName,
               String driverName, Integer capacity, String schedule, String semester) {
        this.id = id;
        this.busNumber = busNumber;
        this.routeName = routeName;
        this.driverName = driverName;
        this.capacity = capacity;
        this.schedule = schedule;
        this.semester = semester;
    }

    // ─── Getters & Setters ───────────────────────────────────────────────────────

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", busNumber='" + busNumber + '\'' +
                ", routeName='" + routeName + '\'' +
                ", driverName='" + driverName + '\'' +
                ", capacity=" + capacity +
                ", schedule='" + schedule + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }
}
