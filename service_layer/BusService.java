package com.iiuc.transport.service;

import com.iiuc.transport.model.Bus;

import java.util.ArrayList;
import java.util.List;

/**
 * BusService – Service Layer
 * Handles all business logic for Bus entity.
 * Uses in-memory storage (ArrayList) with manual Long ID generation.
 */
public class BusService {

    // ─── In-Memory Storage ───────────────────────────────────────────────────────
    private List<Bus> list = new ArrayList<>();
    private Long nextId = 100L;

    // ─── Pre-loaded Sample Data ──────────────────────────────────────────────────
    public BusService() {
        list.add(new Bus(nextId++, "CTG-1234", "Agrabad Route",  "Rahim",   40, "7:30 AM",  "Autumn 2025"));
        list.add(new Bus(nextId++, "CTG-1235", "GEC Circle Route", "Karim", 35, "8:00 AM",  "Autumn 2025"));
        list.add(new Bus(nextId++, "CTG-1236", "Oxygen Route",   "Jamal",   45, "8:30 AM",  "Autumn 2025"));
    }

    // ─── add() ───────────────────────────────────────────────────────────────────
    public Bus add(Bus bus) {
        bus.setId(nextId++);
        list.add(bus);
        return bus;
    }

    // ─── getAll() ────────────────────────────────────────────────────────────────
    public List<Bus> getAll() {
        return list;
    }

    // ─── getById() ───────────────────────────────────────────────────────────────
    public Bus getById(Long id) {
        for (Bus bus : list) {
            if (bus.getId().equals(id)) {
                return bus;
            }
        }
        return null;
    }

    // ─── update() ────────────────────────────────────────────────────────────────
    public Bus update(Long id, Bus updatedBus) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                updatedBus.setId(id);
                list.set(i, updatedBus);
                return updatedBus;
            }
        }
        return null;
    }

    // ─── delete() ────────────────────────────────────────────────────────────────
    public boolean delete(Long id) {
        return list.removeIf(bus -> bus.getId().equals(id));
    }
}
