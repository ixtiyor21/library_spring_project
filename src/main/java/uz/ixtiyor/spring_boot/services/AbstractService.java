package uz.ixtiyor.spring_boot.services;

import uz.ixtiyor.spring_boot.mapper.Mapper;
import uz.ixtiyor.spring_boot.reposiroty.AbstractRepository;
import uz.ixtiyor.spring_boot.utils.BaseUtils;
import uz.ixtiyor.spring_boot.utils.validators.Validator;

/**
 * @param <R> repository
 * @param <M> mapper
 * @param <V> validator
 */
public abstract class AbstractService<
        R extends AbstractRepository,
        M extends Mapper,
        V extends Validator> {
    protected final R repository;
    protected final M mapper;
    protected final V validator;
    protected final BaseUtils baseUtils;

    protected AbstractService(R repository, M mapper, V validator, BaseUtils baseUtils) {
        this.repository = repository;
        this.mapper = mapper;
        this.validator = validator;
        this.baseUtils = baseUtils;
    }

    public static interface ProjectService {
    }
}
