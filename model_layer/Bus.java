package com.iiuc.transport.model;

/**
 * Driver Model Class
 * Represents a bus driver entity in the IIUC transport system.
 */
public class Driver {

    private Long id;
    private String driverName;
    private String licenseNumber;
    private String phone;
    private String assignedBusNumber;
    private String semester;

    // ─── Constructors ───────────────────────────────────────────────────────────

    public Driver() {}

    public Driver(Long id, String driverName, String licenseNumber,
                  String phone, String assignedBusNumber, String semester) {
        this.id = id;
        this.driverName = driverName;
        this.licenseNumber = licenseNumber;
        this.phone = phone;
        this.assignedBusNumber = assignedBusNumber;
        this.semester = semester;
    }

    // ─── Getters & Setters ───────────────────────────────────────────────────────

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAssignedBusNumber() {
        return assignedBusNumber;
    }

    public void setAssignedBusNumber(String assignedBusNumber) {
        this.assignedBusNumber = assignedBusNumber;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", driverName='" + driverName + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", phone='" + phone + '\'' +
                ", assignedBusNumber='" + assignedBusNumber + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }
}
