package com.iiuc.transport.service;

import com.iiuc.transport.model.Driver;

import java.util.ArrayList;
import java.util.List;

/**
 * DriverService – Service Layer
 * Handles all business logic for Driver entity.
 * Uses in-memory storage (ArrayList) with manual Long ID generation.
 */
public class DriverService {

    // ─── In-Memory Storage ───────────────────────────────────────────────────────
    private List<Driver> list = new ArrayList<>();
    private Long nextId = 300L;

    // ─── Pre-loaded Sample Data ──────────────────────────────────────────────────
    public DriverService() {
        list.add(new Driver(nextId++, "Rahim",   "DL-001", "01711-000001", "CTG-1234", "Autumn 2025"));
        list.add(new Driver(nextId++, "Karim",   "DL-002", "01711-000002", "CTG-1235", "Autumn 2025"));
        list.add(new Driver(nextId++, "Jamal",   "DL-003", "01711-000003", "CTG-1236", "Autumn 2025"));
    }

    // ─── add() ───────────────────────────────────────────────────────────────────
    public Driver add(Driver driver) {
        driver.setId(nextId++);
        list.add(driver);
        return driver;
    }

    // ─── getAll() ────────────────────────────────────────────────────────────────
    public List<Driver> getAll() {
        return list;
    }

    // ─── getById() ───────────────────────────────────────────────────────────────
    public Driver getById(Long id) {
        for (Driver driver : list) {
            if (driver.getId().equals(id)) {
                return driver;
            }
        }
        return null;
    }

    // ─── update() ────────────────────────────────────────────────────────────────
    public Driver update(Long id, Driver updatedDriver) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                updatedDriver.setId(id);
                list.set(i, updatedDriver);
                return updatedDriver;
            }
        }
        return null;
    }

    // ─── delete() ────────────────────────────────────────────────────────────────
    public boolean delete(Long id) {
        return list.removeIf(driver -> driver.getId().equals(id));
    }
}
