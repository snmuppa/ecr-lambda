package com.hack.street.ninjas.ecr.entity.response;

/**
 * This ENUM Class Provides different Statuses that Assignments Service can encounter and gives out a code for debugging purposes.
 * 
 *   Future reference
 *   - Look at the Possibility of having SUCCESS , NOT_SUCCESS and PARTIAL_SUCCESS as Status
 *   - And having a Switch Case on ErrorType at adapter layer to determine the respective error to throw.
 */
public enum Status {
    SUCCESS,

    PARTIAL_SUCCESS,

    CLIENT_ERROR,

    SERVER_ERROR
}
