//package com.lti.repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.lti.beans.LoginDetails;
//
//
//@Repository
//public class StudentRepositoryImplement implements StudentRepository{
//
//	@PersistenceContext //@Autowired does not work for injecting EntityManager
//    private EntityManager entityManager;
//	
//	@Transactional
//	public void RegisterUser(Student_Information studentinfo) {
//		entityManager.persist(studentinfo);
//		
//	}
//
//	@Transactional
//	 public void save (Object obj) {
//        entityManager.merge(obj);
//    }
//	
//	@Transactional
//	public void savelogin(LoginDetails ls) {
//		entityManager.merge(ls);
//    }
//
//	@Override
//	public Student_Information findById(int id) {
//		return entityManager.find(Student_Information.class, id);
//	}
//	
//	@Override
//	public boolean isUserPresent(String email){
//		return (Long) entityManager
//				.createQuery("select count(s.id) from Student_Info s where s.email_id.email_id = :em")
//				.setParameter("em", email)
//				.getSingleResult() == 1 ? true : false;
//	}
//	@Override
//	public int findByEmailAndPassword(String email,String password) {
//		try {
//		return (int) entityManager
//				.createQuery("select s.stu_id from Student_Info s where s.login.email_id=:em and s.login.password= :pw")
//				.setParameter("em", email)
//				.setParameter("pw", password)
//				.getSingleResult();
//		}
//		catch(Exception e) {
//			System.out.println(e);
//			return -1;
//		}
//		
//	}
//}
