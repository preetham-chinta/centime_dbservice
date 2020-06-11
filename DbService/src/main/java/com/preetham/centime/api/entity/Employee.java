package com.preetham.centime.api.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;


@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Employee {

    @Id
    @EqualsAndHashCode.Include
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="parentid")
    private Employee parent;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "parent")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Set<Employee> children;
    
    @Column(name="color")
    private String color;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", parent=");
		builder.append(parent);
		builder.append(", children=");
		builder.append(children.size());
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Employee getParent() {
		return parent;
	}




	public void setParent(Employee parent) {
		this.parent = parent;
	}




	public Set<Employee> getChildren() {
		return children;
	}




	public void setChildren(Set<Employee> children) {
		this.children = children;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}
    
    
    
    
}