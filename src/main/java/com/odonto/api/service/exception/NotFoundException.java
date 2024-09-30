package com.odonto.api.service.exception;

public class NotFoundException extends BusinessException {

    private  static final long serialVersionUID = 1L;

    public NotFoundException() {
        super("Recurso não encontrado.");
    }

}
