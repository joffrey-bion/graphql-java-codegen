package com.kobylynskyi.graphql.codegen.model.request.data;

import java.util.*;
import graphql.language.*;

public class EventsByCategoryAndStatusQueryRequest implements com.kobylynskyi.graphql.codegen.model.request.GraphQLOperationRequest {

    private static final OperationDefinition.Operation OPERATION_TYPE = OperationDefinition.Operation.QUERY;
    private static final String OPERATION_NAME = "eventsByCategoryAndStatus";

    private Map<String, Object> input = new LinkedHashMap<>();

    public EventsByCategoryAndStatusQueryRequest() {
    }

    public void setCategoryId(String categoryId) {
        this.input.put("categoryId", categoryId);
    }

    public void setStatus(Status status) {
        this.input.put("status", status);
    }

    @Override
    public OperationDefinition.Operation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

}