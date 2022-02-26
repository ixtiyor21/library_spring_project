package uz.ixtiyor.spring_boot.utils.validators;

import uz.ixtiyor.spring_boot.exceptions.ValidationException;
import uz.ixtiyor.spring_boot.utils.BaseUtils;

public abstract class AbstractValidator<CD, UD, K> implements Validator {

    protected final BaseUtils baseUtils;

    protected AbstractValidator(BaseUtils baseUtils) {
        this.baseUtils = baseUtils;
    }

    public abstract void validateKey(K id) throws ValidationException;

    public abstract void validOnCreate(CD cd) throws ValidationException;

    public abstract void validOnUpdate(UD cd) throws ValidationException;


}
