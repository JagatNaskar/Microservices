package com.lcwd.hotel.HotelService.entities;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="hotels")
public class Hotel {
	
	@Id
	private String id;
//	@Column(name="name")
	private String name;
//	@Column(name="location")
	private String location;
//	@Column(name="about")
	private String about;
}
