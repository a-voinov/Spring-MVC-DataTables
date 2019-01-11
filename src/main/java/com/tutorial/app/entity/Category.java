package com.tutorial.app.entity;
// Generated 10.01.2019 10:17:19 by Hibernate Tools 5.2.11.Final

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Category generated by hbm2java
 */
@Entity
@Table(name = "category", schema = "public")
public class Category implements java.io.Serializable {

	private int categoryId;
	private String name;
	private Date lastUpdate;
	private Set<FilmCategory> filmCategories = new HashSet<FilmCategory>(0);

	public Category() {
	}

	public Category(int categoryId, String name, Date lastUpdate) {
		this.categoryId = categoryId;
		this.name = name;
		this.lastUpdate = lastUpdate;
	}

	public Category(int categoryId, String name, Date lastUpdate, Set<FilmCategory> filmCategories) {
		this.categoryId = categoryId;
		this.name = name;
		this.lastUpdate = lastUpdate;
		this.filmCategories = filmCategories;
	}

	@Id

	@Column(name = "category_id", unique = true, nullable = false)
	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "name", nullable = false, length = 25)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update", nullable = false, length = 29)
	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<FilmCategory> getFilmCategories() {
		return this.filmCategories;
	}

	public void setFilmCategories(Set<FilmCategory> filmCategories) {
		this.filmCategories = filmCategories;
	}

}
