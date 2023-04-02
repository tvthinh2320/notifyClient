
package org.notifyClient.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "reqCode",
    "notifyTyp",
    "wbCode",
    "data"
})
@Generated("jsonschema2pojo")
public class Request {

    @JsonProperty("reqCode")
    private String reqCode;
    @JsonProperty("notifyTyp")
    private String notifyTyp;
    @JsonProperty("wbCode")
    private String wbCode;
    @JsonProperty("data")
    private List<Datum> data;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("reqCode")
    public String getReqCode() {
        return reqCode;
    }

    @JsonProperty("reqCode")
    public void setReqCode(String reqCode) {
        this.reqCode = reqCode;
    }

    @JsonProperty("notifyTyp")
    public String getNotifyTyp() {
        return notifyTyp;
    }

    @JsonProperty("notifyTyp")
    public void setNotifyTyp(String notifyTyp) {
        this.notifyTyp = notifyTyp;
    }

    @JsonProperty("wbCode")
    public String getWbCode() {
        return wbCode;
    }

    @JsonProperty("wbCode")
    public void setWbCode(String wbCode) {
        this.wbCode = wbCode;
    }

    @JsonProperty("data")
    public List<Datum> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum> data) {
        this.data = data;
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
