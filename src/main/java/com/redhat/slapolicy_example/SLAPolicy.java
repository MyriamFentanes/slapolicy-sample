package com.redhat.slapolicy_example;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class SLAPolicy implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label("description")
	private java.lang.String description;

	@org.kie.api.definition.type.Label("priority")
	private java.lang.String priority;

	@org.kie.api.definition.type.Label("resolutionDuration")
	private java.lang.String resolutionDuration;

	@org.kie.api.definition.type.Label(value = "escalation")
	private com.redhat.slapolicy_example.SLAEscalation escalation;

	public SLAPolicy() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getPriority() {
		return this.priority;
	}

	public void setPriority(java.lang.String priority) {
		this.priority = priority;
	}

	public java.lang.String getResolutionDuration() {
		return this.resolutionDuration;
	}

	public void setResolutionDuration(java.lang.String resolutionDuration) {
		this.resolutionDuration = resolutionDuration;
	}

	public com.redhat.slapolicy_example.SLAEscalation getEscalation() {
		return this.escalation;
	}

	public void setEscalation(
			com.redhat.slapolicy_example.SLAEscalation escalation) {
		this.escalation = escalation;
	}

	public SLAPolicy(java.lang.String name, java.lang.String description,
			java.lang.String priority, java.lang.String resolutionDuration,
			com.redhat.slapolicy_example.SLAEscalation escalation) {
		this.name = name;
		this.description = description;
		this.priority = priority;
		this.resolutionDuration = resolutionDuration;
		this.escalation = escalation;
	}

}