package com.uusmonov.challenge.model.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Users{

	@JsonProperty("website")
	private String website;

	@JsonProperty("address")
	private Address address;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("name")
	private String name;

	@JsonProperty("company")
	private Company company;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("email")
	private String email;

	@JsonProperty("username")
	private String username;
}