
package com.qa.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "trainerId",
    "trainerName",
    "skills"
})
public class Trainer {

    @JsonProperty("trainerId")
    private Integer trainerId;
    @JsonProperty("trainerName")
    private String trainerName;
    @JsonProperty("skills")
    private List<Skill> skills = null;

    @JsonProperty("trainerId")
    public Integer getTrainerId() {
        return trainerId;
    }

    @JsonProperty("trainerId")
    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    @JsonProperty("trainerName")
    public String getTrainerName() {
        return trainerName;
    }

    @JsonProperty("trainerName")
    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    @JsonProperty("skills")
    public List<Skill> getSkills() {
        return skills;
    }

    @JsonProperty("skills")
    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
