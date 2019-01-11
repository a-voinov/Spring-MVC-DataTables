package com.tutorial.app.dao;
// Generated 10.01.2019 10:31:41 by Hibernate Tools 5.2.11.Final

import com.tutorial.app.entity.Payment;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Home object for domain model class Payment.
 * @see com.tutorial.app.entity.Payment
 * @author Hibernate Tools
 */
@Repository
public class PaymentHome {

	private static final Log log = LogFactory.getLog(PaymentHome.class);

	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public void persist(Payment transientInstance) {
		log.debug("persisting Payment instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Payment persistentInstance) {
		log.debug("removing Payment instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Payment merge(Payment detachedInstance) {
		log.debug("merging Payment instance");
		try {
			Payment result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Payment findById(int id) {
		log.debug("getting Payment instance with id: " + id);
		try {
			Payment instance = entityManager.find(Payment.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	// MANUALLY WRITTEN METHODS --------------------------------------------------

	public int getRecordsCount(){
		log.debug("getting records count");
		try {
			Long result  =
					entityManager.createQuery(
							"select count(*) from Payment", Long.class).getSingleResult();
			log.debug("get successful");
			return result.intValue();
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}

	}

	public List<Payment> getAll(int startPos, int maxResults) {
		log.debug("getting Payments");
		try {
			TypedQuery<Payment> query = entityManager.createQuery("from Payment", Payment.class);
			query.setFirstResult(startPos);
			query.setMaxResults(maxResults);
			List<Payment> result = query.getResultList();
			log.debug("get successful");
			return result;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
