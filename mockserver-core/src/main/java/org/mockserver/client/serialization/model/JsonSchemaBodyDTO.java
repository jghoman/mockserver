package org.mockserver.client.serialization.model;

import org.mockserver.model.Body;
import org.mockserver.model.JsonSchemaBody;

/**
 * @author jamesdbloom
 */
public class JsonSchemaBodyDTO extends BodyDTO {

    private String jsonSchema;

    public JsonSchemaBodyDTO(JsonSchemaBody jsonSchemaBody) {
        super(Body.Type.JSON_SCHEMA);
        this.jsonSchema = jsonSchemaBody.getValue();
    }

    protected JsonSchemaBodyDTO() {
    }

    public String getJson() {
        return jsonSchema;
    }

    public JsonSchemaBody buildObject() {
        return new JsonSchemaBody(getJson());
    }
}
