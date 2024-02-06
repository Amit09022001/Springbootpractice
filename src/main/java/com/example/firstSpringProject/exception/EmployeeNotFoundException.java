package com.example.firstSpringProject.exception;

public class EmployeeNotFoundException extends RuntimeException {
    private String message;
    private int id;
    private String resoureName;
    private String fieldName;
    private String name;

    public EmployeeNotFoundException(String resoureName, String fieldName, int id) {
        super(String.format("%s not found with %s : '%d'", resoureName, fieldName, id));
        this.id = id;
        this.fieldName = fieldName;
        this.resoureName = resoureName;
    }

    public EmployeeNotFoundException(String resoureName, String fieldName) {
        super(String.format("%s not exist for given %s", resoureName, fieldName));
        this.fieldName = fieldName;
        this.resoureName = resoureName;
    }

}
