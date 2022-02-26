package uz.ixtiyor.spring_boot.controller;

import uz.ixtiyor.spring_boot.services.BaseService;

public abstract class AbstractController<S extends BaseService> {
    protected final S service;

    public AbstractController(S service) {
        this.service = service;
    }
}
