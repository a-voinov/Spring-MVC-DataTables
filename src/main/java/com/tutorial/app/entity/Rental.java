package com.tutorial.app.entity;
// Generated 10.01.2019 10:17:19 by Hibernate Tools 5.2.11.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Rental generated by hbm2java
 */
@Entity
@Table(name = "rental", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = { "rental_date",
		"inventory_id", "customer_id" }))
public class Rental implements java.io.Serializable {

	private int rentalId;
	private Customer customer;
	private Inventory inventory;
	private Staff staff;
	private Date rentalDate;
	private Date returnDate;
	private Date lastUpdate;
	private Set<Payment> payments = new HashSet<Payment>(0);

	public Rental() {
	}

	public Rental(int rentalId, Customer customer, Inventory inventory, Staff staff, Date rentalDate, Date lastUpdate) {
		this.rentalId = rentalId;
		this.customer = customer;
		this.inventory = inventory;
		this.staff = staff;
		this.rentalDate = rentalDate;
		this.lastUpdate = lastUpdate;
	}

	public Rental(int rentalId, Customer customer, Inventory inventory, Staff staff, Date rentalDate, Date returnDate,
			Date lastUpdate, Set<Payment> payments) {
		this.rentalId = rentalId;
		this.customer = customer;
		this.inventory = inventory;
		this.staff = staff;
		this.rentalDate = rentalDate;
		this.returnDate = returnDate;
		this.lastUpdate = lastUpdate;
		this.payments = payments;
	}

	@Id

	@Column(name = "rental_id", unique = true, nullable = false)
	public int getRentalId() {
		return this.rentalId;
	}

	public void setRentalId(int rentalId) {
		this.rentalId = rentalId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id", nullable = false)
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "inventory_id", nullable = false)
	public Inventory getInventory() {
		return this.inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "staff_id", nullable = false)
	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "rental_date", nullable = false, length = 29)
	public Date getRentalDate() {
		return this.rentalDate;
	}

	public void setRentalDate(Date rentalDate) {
		this.rentalDate = rentalDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "return_date", length = 29)
	public Date getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update", nullable = false, length = 29)
	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rental")
	public Set<Payment> getPayments() {
		return this.payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

}
