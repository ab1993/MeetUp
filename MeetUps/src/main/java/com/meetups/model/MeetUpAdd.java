package com.meetups.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name = "meetupadd")
public class MeetUpAdd {
	@Id@GeneratedValue
	private int id;
	//@NotEmpty(message="title can't be blank")
	private String title;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPresenter() {
		return presenter;
	}
	public void setPresenter(String presenter) {
		this.presenter = presenter;
	}
	public String getGuest() {
		return guest;
	}
	public void setGuest(String guest) {
		this.guest = guest;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	//@NotEmpty(message="description can't be blank")
	private String description;
//	@NotEmpty(message="presenter can't be blank")
	private String presenter;
	//@NotEmpty(message="guest can't be blank")
	private String guest;
	//@NotEmpty(message="date can't be blank")
	private String date;
	//@NotEmpty(message="start_time can't be blank")
	private String start_time;
	//@NotEmpty(message="end_time can't be blank")
	private String end_time;
}
