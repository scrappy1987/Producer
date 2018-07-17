
package com.qa.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "skillId",
    "skillName"
})
public class Skill {

    @JsonProperty("skillId")
    private Integer skillId;
    @JsonProperty("skillName")
    private String skillName;

    @JsonProperty("skillId")
    public Integer getSkillId() {
        return skillId;
    }

    @JsonProperty("skillId")
    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    @JsonProperty("skillName")
    public String getSkillName() {
        return skillName;
    }

    @JsonProperty("skillName")
    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
}
