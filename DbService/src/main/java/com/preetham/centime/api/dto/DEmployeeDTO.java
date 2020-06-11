package com.preetham.centime.api.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DEmployeeDTO {
	
	private String name;

    @JsonProperty(value="Sub Classes")
    private Set<DEmployeeDTO> children;
    
    

    public String getName() {
		return name;
	}
    
	public void setName(String name) {
		this.name = name;
	}



	public Set<DEmployeeDTO> getChildren() {
		return children;
	}



	public void setChildren(Set<DEmployeeDTO> children) {
		this.children = children;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeDTO [name=");
		builder.append(name);
		builder.append(", children=");
		builder.append(children);
		builder.append("]");
		return builder.toString();
	}
    

}
