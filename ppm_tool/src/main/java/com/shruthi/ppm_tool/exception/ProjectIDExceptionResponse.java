package com.shruthi.ppm_tool.exception;

public class ProjectIDExceptionResponse {
    private String projectIdentifier;

    public ProjectIDExceptionResponse(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }
}
