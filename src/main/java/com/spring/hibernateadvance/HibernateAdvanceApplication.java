package com.spring.hibernateadvance;

import com.spring.hibernateadvance.entities.*;
import jakarta.persistence.Transient;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@SpringBootApplication
@Slf4j
public class HibernateAdvanceApplication implements CommandLineRunner {

	@PersistenceContext
	private EntityManager entityManager;

	public static void main(String[] args) {
		SpringApplication.run(HibernateAdvanceApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		/**
		 * SET : 02-hb_student_tracker_set.sql
		 */

//		// create object
//		Student rahul = Student.builder()
//				.firstName("Rahul")
//				.lastName("Choudhary")
//				.email("no-reply@test.com")
//				.build();
//		Set<String> rahulImages = rahul.getImages();
//		if(rahulImages == null) {
//			rahulImages = new HashSet<>();
//		}
//		rahulImages.add("photo1.jpg");
//		rahulImages.add("photo2.jpg");
//		rahulImages.add("photo3.jpg");
//		rahul.setImages(rahulImages);
//
//		Student ravi = Student.builder()
//				.firstName("Ravi")
//				.lastName("Baswan")
//				.email("ravi-reply@test.com")
//				.build();
//		Set<String> raviImages = ravi.getImages();
//		if(raviImages == null) {
//			raviImages = new HashSet<>();
//		}
//		raviImages.add("photo1.jpg");
//		raviImages.add("photo2.jpg");
//		raviImages.add("photo3.jpg");
//		ravi.setImages(raviImages);
//
//		// save object
//		entityManager.persist(rahul);
//		entityManager.persist(ravi);

		/**
		 * LIST: 03-hb_student_tracker_list.sql
		 */
//		// create object
//		Student rahul = Student.builder()
//				.firstName("Rahul")
//				.lastName("Choudhary")
//				.email("no-reply@test.com")
//				.build();
//		List<String> rahulImages = rahul.getImages();
//		if(rahulImages == null) {
//			rahulImages = new ArrayList<>();
//		}
//		rahulImages.add("photo1.jpg");
//		rahulImages.add("photo2.jpg");
//		rahulImages.add("photo3.jpg");
//		rahul.setImages(rahulImages);
//
//		Student ravi = Student.builder()
//				.firstName("Ravi")
//				.lastName("Baswan")
//				.email("ravi-reply@test.com")
//				.build();
//		List<String> raviImages = ravi.getImages();
//		if(raviImages == null) {
//			raviImages = new ArrayList<>();
//		}
//		raviImages.add("photo1.jpg");
//		raviImages.add("photo2.jpg");
//		raviImages.add("photo3.jpg");
//		ravi.setImages(raviImages);
//
//		// save object
//		entityManager.persist(rahul);
//		entityManager.persist(ravi);


		/**
		 * MAP: 04-hb_student_tracker_map.sql
		 */
//		// create object
//		Student rahul = Student.builder()
//				.firstName("Rahul")
//				.lastName("Choudhary")
//				.email("no-reply@test.com")
//				.build();
//		Map<String,String> rahulImages = rahul.getImages();
//		if(rahulImages == null) {
//			rahulImages = new HashMap<>();
//		}
//		rahulImages.put("photo1.jpg","First Image");
//		rahulImages.put("photo2.jpg","Second Image");
//		rahulImages.put("photo3.jpg","Third Image");
//		rahul.setImages(rahulImages);
//
//		Student ravi = Student.builder()
//				.firstName("Ravi")
//				.lastName("Baswan")
//				.email("ravi-reply@test.com")
//				.build();
//		Map<String,String> raviImages = ravi.getImages();
//		if(raviImages == null) {
//			raviImages = new HashMap<>();
//		}
//		raviImages.put("photo1.jpg","First Image");
//		raviImages.put("photo2.jpg","Second Image");
//		raviImages.put("photo3.jpg","Third Image");
//		ravi.setImages(raviImages);
//
//		// save object
//		entityManager.persist(rahul);
//		entityManager.persist(ravi);

		/**
		 * SORTED SET: 05-hb_student_tracker_sorted_set.sql
		 */

//		// create object
//		Student rahul = Student.builder()
//				.firstName("Rahul")
//				.lastName("Choudhary")
//				.email("no-reply@test.com")
//				.build();
//		Set<String> rahulImages = rahul.getImages();
//		if(rahulImages == null) {
//			rahulImages = new LinkedHashSet<>();
//		}
//		rahulImages.add("photo1.jpg");
//		rahulImages.add("photo2.jpg");
//		rahulImages.add("photo3.jpg");
//		rahulImages.add("photo4.jpg");
//		rahulImages.add("photo5.jpg");
//		rahul.setImages(rahulImages);
//
//		Student ravi = Student.builder()
//				.firstName("Ravi")
//				.lastName("Baswan")
//				.email("ravi-reply@test.com")
//				.build();
//		Set<String> raviImages = ravi.getImages();
//		if(raviImages == null) {
//			raviImages = new LinkedHashSet<>();
//		}
//		raviImages.add("photo1.jpg");
//		raviImages.add("photo2.jpg");
//		raviImages.add("photo3.jpg");
//		ravi.setImages(raviImages);
//
//		// save object
//		entityManager.persist(rahul);
//		entityManager.persist(ravi);


		/**
		 *  RETRIEVE SORTED SET IN DESC
 		 */
//		Student student = entityManager.find(Student.class, 1);
//		log.info(student.toString());
//		log.info(student.getImages().toString());


		/**
		 *  RETRIEVE SORTED MAP IN DESC: 06-hb_student_tracker_sorted_map.sql
		 */
		//		// create object
//		Student rahul = Student.builder()
//				.firstName("Rahul")
//				.lastName("Choudhary")
//				.email("no-reply@test.com")
//				.build();
//		Map<String,String> rahulImages = rahul.getImages();
//		if(rahulImages == null) {
//			rahulImages = new LinkedHashMap<>();
//		}
//		rahulImages.put("photo1.jpg","First Image");
//		rahulImages.put("photo2.jpg","Second Image");
//		rahulImages.put("photo3.jpg","Third Image");
//		rahulImages.put("photo4.jpg","Third Image");
//		rahulImages.put("photo5.jpg","Third Image");
//		rahul.setImages(rahulImages);
//
//		Student ravi = Student.builder()
//				.firstName("Ravi")
//				.lastName("Baswan")
//				.email("ravi-reply@test.com")
//				.build();
//		Map<String,String> raviImages = ravi.getImages();
//		if(raviImages == null) {
//			raviImages = new LinkedHashMap<>();
//		}
//		raviImages.put("photo1.jpg","First Image");
//		raviImages.put("photo2.jpg","Second Image");
//		raviImages.put("photo3.jpg","Third Image");
//		ravi.setImages(raviImages);
//
//		// save object
//		entityManager.persist(rahul);
//		entityManager.persist(ravi);

		/**
		 *  RETRIEVE SORTED MAP IN DESC
		 */
//		Student student = entityManager.find(Student.class, 1);
//		log.info(student.toString());
//		log.info(student.getImages().toString());

		/**
		 * Embedded Object Address in Student Class: 07-hb_student_tracker_embedded.sql
		 */
//		Address address = Address.builder()
//				.street("Luxmburg")
//				.city("Berlin")
//				.zipcode("1935HK")
//				.build();
//
//		Student rahul = Student.builder()
//				.firstName("Rahul")
//				.lastName("Choudhary")
//				.email("no-reply@test.com")
//				.address(address)
//				.build();
//
//		entityManager.persist(rahul);

		/**
		 * Embedded Object Address in Student Class Reuse: 08-hb_student_tracker_embedded_reuse.sql
		 */
//		Address shoppingAddress = Address.builder()
//				.street("Luxmburg")
//				.city("Berlin")
//				.zipcode("1935HK")
//				.build();
//
//		Address billingAddress = Address.builder()
//				.street("Duslfdorf")
//				.city("Germany")
//				.zipcode("3162HK")
//				.build();
//
//		Student rahul = Student.builder()
//				.firstName("Rahul")
//				.lastName("Choudhary")
//				.email("no-reply@test.com")
//				.shoppingAddress(shoppingAddress)
//				.billingAddress(billingAddress)
//				.build();
//
//		entityManager.persist(rahul);

		/**
		 * MAPPING ENUMS: 09-hb_student_tracker_enum.sql
		 */
//		Student rahul = Student.builder()
//				.firstName("Rahul")
//				.lastName("Choudhary")
//				.email("no-reply@test.com")
//				.status(Status.ACTIVE)
//				.build();
//
//		entityManager.persist(rahul);

//		Student student = entityManager.find(Student.class, 1);
//		log.info(student.toString());


		/**
		 * MAPPING INHERITANCE
		 * Using Inheritance with ORM will increase complexity of the application and adversely affect the application performance
		 *
		 * Single Table
		 * Table Per Class
		 * Joined Table
		 * Mapped Super Class
		 *
		 * Ex User Super Class & Student & Instructor are Sub Class
		 * User: id, firstName, lastName, email
		 * Student: courses
		 * Instructor: salary
		 *
		 */


		/**
		 * Single Table: 10-hb_user_tracker_single_table.sql
		 * Maps all entities in inheritance tree to a single database table
		 * Discriminator column indicate type/class of data in row
		 * Table has column for all fields in the inheritance tree
		 * Each row will only use the subset of fields
		 * Unused fields are null
		 */
//		Learner ormCourse = Learner.builder()
//				.firstName("Rahul")
//				.lastName("Choudhary")
//				.email("no-reply@test.com")
//				.course("ORM Course")
//				.build();
//		Instructor instructor = Instructor.builder()
//				.firstName("Chad")
//				.lastName("Darby")
//				.email("no-reply@test.com")
//				.salary(3000.00).build();
//
//		entityManager.persist(ormCourse);
//		entityManager.persist(instructor);

		/**
		 * Table Per Class : 11-hb_user_tracker_table_per_class.sql
		 * All Concrete Class are mapped to table per class
		 * User will be abstract class
		 * Learner & Instructor are Concrete Class
		 *
		 * @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
		 * @GeneratedValue(strategy = GenerationType.TABLE)
		 */

		Learner ormCourse = Learner.builder()
				.firstName("Rahul")
				.lastName("Choudhary")
				.email("no-reply@test.com")
				.course("ORM Course")
				.build();
		Instructor instructor = Instructor.builder()
				.firstName("Chad")
				.lastName("Darby")
				.email("no-reply@test.com")
				.salary(3000.00).build();

		entityManager.persist(ormCourse);
		entityManager.persist(instructor);
	}
}
