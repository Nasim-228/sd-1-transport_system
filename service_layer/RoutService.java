package com.iiuc.transport.service;

import com.iiuc.transport.model.Route;

import java.util.ArrayList;
import java.util.List;

/**
 * RouteService – Service Layer
 * Handles all business logic for Route entity.
 * Uses in-memory storage (ArrayList) with manual Long ID generation.
 */
public class RouteService {

    // ─── In-Memory Storage ───────────────────────────────────────────────────────
    private List<Route> list = new ArrayList<>();
    private Long nextId = 200L;

    // ─── Pre-loaded Sample Data ──────────────────────────────────────────────────
    public RouteService() {
        list.add(new Route(nextId++, "Agrabad Route",   "IIUC Campus", "Agrabad",    "45 mins", "Autumn 2025"));
        list.add(new Route(nextId++, "GEC Circle Route","IIUC Campus", "GEC Circle", "50 mins", "Autumn 2025"));
        list.add(new Route(nextId++, "Oxygen Route",    "IIUC Campus", "Oxygen",     "30 mins", "Autumn 2025"));
    }

    // ─── add() ───────────────────────────────────────────────────────────────────
    public Route add(Route route) {
        route.setId(nextId++);
        list.add(route);
        return route;
    }

    // ─── getAll() ────────────────────────────────────────────────────────────────
    public List<Route> getAll() {
        return list;
    }

    // ─── getById() ───────────────────────────────────────────────────────────────
    public Route getById(Long id) {
        for (Route route : list) {
            if (route.getId().equals(id)) {
                return route;
            }
        }
        return null;
    }

    // ─── update() ────────────────────────────────────────────────────────────────
    public Route update(Long id, Route updatedRoute) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                updatedRoute.setId(id);
                list.set(i, updatedRoute);
                return updatedRoute;
            }
        }
        return null;
    }

    // ─── delete() ────────────────────────────────────────────────────────────────
    public boolean delete(Long id) {
        return list.removeIf(route -> route.getId().equals(id));
    }
}
