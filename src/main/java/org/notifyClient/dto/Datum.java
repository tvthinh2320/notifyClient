
package org.notifyClient.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "taskCode",
    "binCode"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("taskCode")
    private String taskCode;
    @JsonProperty("binCode")
    private String binCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("taskCode")
    public String getTaskCode() {
        return taskCode;
    }

    @JsonProperty("taskCode")
    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    @JsonProperty("binCode")
    public String getBinCode() {
        return binCode;
    }

    @JsonProperty("binCode")
    public void setBinCode(String binCode) {
        this.binCode = binCode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
