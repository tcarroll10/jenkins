package com.tcarroll10.jenkins.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.Getter;
import lombok.ToString;

@JsonDeserialize(builder = ThemeParkRide.Builder.class)
@Entity
@Getter
@ToString
//@NoArgsConstructor
public class ThemeParkRide {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotEmpty
	private String name;
	@NotEmpty
	private String description;
	private int thrillFactor;
	private int vomitFactor;

	public ThemeParkRide(String name, String description, int thrillFactor, int vomitFactor) {
		this.name = name;
		this.description = description;
		this.thrillFactor = thrillFactor;
		this.vomitFactor = vomitFactor;
	}

	public ThemeParkRide() {

	}

	private ThemeParkRide(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.description = builder.description;
		this.thrillFactor = builder.thrillFactor;
		this.vomitFactor = builder.vomitFactor;
	}

	/**
	 * Creates builder to build {@link ThemeParkRide}.
	 * 
	 * @return created builder
	 */
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Creates a builder to build {@link ThemeParkRide} and initialize it with the
	 * given object.
	 * 
	 * @param themeParkRide to initialize the builder with
	 * @return created builder
	 */
	public static Builder builder(ThemeParkRide themeParkRide) {
		return new Builder(themeParkRide);
	}

	/**
	 * Builder to build {@link ThemeParkRide}.
	 */
	@JsonPOJOBuilder(buildMethodName = "build", withPrefix = "")
	public static final class Builder {
		private Long id;
		private String name;
		private String description;
		private int thrillFactor;
		private int vomitFactor;

		private Builder() {
		}

		private Builder(ThemeParkRide themeParkRide) {
			this.id = themeParkRide.id;
			this.name = themeParkRide.name;
			this.description = themeParkRide.description;
			this.thrillFactor = themeParkRide.thrillFactor;
			this.vomitFactor = themeParkRide.vomitFactor;
		}

		public Builder id(Long id) {
			this.id = id;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder description(String description) {
			this.description = description;
			return this;
		}

		public Builder thrillFactor(int thrillFactor) {
			this.thrillFactor = thrillFactor;
			return this;
		}

		public Builder vomitFactor(int vomitFactor) {
			this.vomitFactor = vomitFactor;
			return this;
		}

		public ThemeParkRide build() {
			return new ThemeParkRide(this);
		}
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getThrillFactor() {
		return thrillFactor;
	}

	public int getVomitFactor() {
		return vomitFactor;
	}

	@Override
	public String toString() {
		return "ThemeParkRide [id=" + id + ", name=" + name + ", description=" + description + ", thrillFactor="
				+ thrillFactor + ", vomitFactor=" + vomitFactor + "]";
	}

}