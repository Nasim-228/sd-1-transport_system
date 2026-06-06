package com.iiuc.transport.model;

/**
 * Route Model Class
 * Represents a bus route entity in the IIUC transport system.
 */
public class Route {

    private Long id;
    private String routeName;
    private String startPoint;
    private String endPoint;
    private String estimatedDuration;
    private String semester;

    // ─── Constructors ───────────────────────────────────────────────────────────

    public Route() {}

    public Route(Long id, String routeName, String startPoint,
                 String endPoint, String estimatedDuration, String semester) {
        this.id = id;
        this.routeName = routeName;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.estimatedDuration = estimatedDuration;
        this.semester = semester;
    }

    // ─── Getters & Setters ───────────────────────────────────────────────────────

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public String getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(String estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", routeName='" + routeName + '\'' +
                ", startPoint='" + startPoint + '\'' +
                ", endPoint='" + endPoint + '\'' +
                ", estimatedDuration='" + estimatedDuration + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }
}
