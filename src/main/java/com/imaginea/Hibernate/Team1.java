package com.imaginea.Hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Query;
import org.hibernate.Session;

import com.imaginea.Persistence.HibernateUtil;

@Entity
@Table(name = "Team1")
public class Team1 implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "batsmen")
	private String batsmen;

	@Column(name = "runs")
	private Integer runs;

	public Team1() {
	}

	public String getBatsmen() {
		return this.batsmen;
	}

	public void setBatsmen(String batsmen) {
		this.batsmen = batsmen;
	}

	public void setRuns(Integer batScore) {
		this.runs = batScore;
	}

	public Integer getRuns() {
		return this.runs;
	}

	public List getRuns(String batsmenName) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session
				.createQuery("select runs from Team1 t where t.batsmen=:batsmenName");
		query.setParameter("batsmenName", batsmenName);
		return query.list();
	}
	
	public List setRuns(String batsmenName,Integer runsScored) {
		Session session = HibernateUtil.getSessionFactory().openSession();
//		session.beginTransaction(); 
//		@Query(sql = "SELECT * FROM PERSON_TABLE");
		Query query = session.createQuery("update Team1 set runs = :runsScored where batsmen = :batsmenName");
		query.setParameter("batsmenName", batsmenName);
		query.setParameter("runsScored",runsScored);
		int result = query.executeUpdate();
		System.out.println("Rows affected: " + result);
		return query.list();
	}
}
