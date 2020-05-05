package com.javabykiran.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hibernate.Addnewuser;

@Repository
public class DeleteUserDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public boolean deleteUser(int id) {
		System.out.println("i am in DeleteUserDao");
		Session session=sessionFactory.openSession();
		 Addnewuser user=session.load(Addnewuser.class, id);
		 Transaction tt= session.beginTransaction();
		String ss= user.getIsDefault();
		if(ss.equals("Yes")) {
			return false;
		}else
		session.delete(user);
		tt.commit();
		System.out.println("record deleted");
		return true;
		
	}
	
	public boolean deleteMultiUser(int[] id) {
		System.out.println("i am in DeleteUserDao");
		Session session=sessionFactory.openSession();
		for(int i=0;i<id.length;i++) {
			System.out.println(id[i]+"");
		 Addnewuser user=session.load(Addnewuser.class, id[i]);
		session.delete(user);
		}
		Transaction tt= session.beginTransaction();
		tt.commit();
		System.out.println("record deleted");
		return true;

}
}
