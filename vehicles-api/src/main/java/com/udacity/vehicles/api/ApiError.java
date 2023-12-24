package com.udacity.vehicles.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

/**
 * Declares methods to return errors and other messages from the API.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@Getter @Setter
class ApiError {

    private final String message;
    private final List<String> errors;

}
