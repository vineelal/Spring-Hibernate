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
@Table(name = "BallResults")
public class BallResults implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ballScore")
	private Integer ballScore;

	@Column(name = "result")
	private String result;

	public BallResults() {
	}

	public BallResults(Integer ballScore, String result) {
		this.ballScore = ballScore;
		this.result = result;
	}

	public Integer getBallScore() {
		return this.ballScore;
	}

	public void setBallScore(Integer ballScore) {
		this.ballScore = ballScore;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public List getResult(Integer score){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session
				.createQuery("select t.result from BallResults t where t.ballScore = :score ");
		query.setParameter("score", score);
		return query.list();
	}
}
