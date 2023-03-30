package pro.sky.skyprohomework25.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

public class EmployeeAlreadyAddedException extends RuntimeException {
    public EmployeeAlreadyAddedException(String message) {
        super(message);
    }
}
