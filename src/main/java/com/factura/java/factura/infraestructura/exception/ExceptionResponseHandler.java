package com.factura.java.factura.infraestructura.exception;

import com.factura.java.factura.dominio.exception.ExceptionDominio;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestController
@ControllerAdvice
public class ExceptionResponseHandler  extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> manejarTodasExcepciones(Exception ex, WebRequest request) {
        ExceptionResponse excepResp = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(excepResp, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ExceptionDominio.class)
    public final ResponseEntity<Object> manejarExcepcionDominio(Exception ex, WebRequest request) {
        ExceptionResponse excepResp = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(excepResp, HttpStatus.BAD_REQUEST);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatus status, WebRequest request) {

        StringBuilder bld = new StringBuilder();
        for (ObjectError error : ex.getBindingResult().getAllErrors()) {
            bld.append(error.getDefaultMessage());
        }
        String errores = bld.toString();
        ExceptionResponse excepResp = new ExceptionResponse(new Date(), "validacion fallida", errores);
        return new ResponseEntity<>(excepResp, HttpStatus.BAD_REQUEST);
    }
}
