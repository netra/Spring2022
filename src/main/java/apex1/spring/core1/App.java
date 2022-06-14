package apex1.spring.core1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import apex1.spring.core1.pojo.CollectionsDemoClass;
import apex1.spring.core1.pojo.LifeCycleHook;
import apex1.spring.core1.pojo.Person;
import apex1.spring.core1.pojo.ScopeDemoClass;
import apex1.spring.core1.pojo.Student;
import apex1.spring.core1.pojo.annotation.Apple;
import apex1.spring.core1.pojo.annotation.Basket;
import apex1.spring.core1.pojo.annotation.Orange;
import apex1.spring.core1.pojo.autowiring.User;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
//        
//        Student st = new Student();
//        st.setAge(43);
//        st.setName("Amit");
//        System.out.println(st);

		System.out.println("\n====== Demo of First Spring Projrct ======");
//        ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
//        Student stSpring = ctx.getBean("idname2", Student.class);

		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		// Student stSpring = ctx.getBean("id3", Student.class);
		Student stSpring = (Student) ctx.getBean("id3");
		System.out.println(stSpring);
		
		System.out.println("\n====== Demo of First Dependency Injection ======");
		ApplicationContext ctx1 = new ClassPathXmlApplicationContext("person.xml");
		Person stSpring1 = ctx1.getBean("p_id1", Person.class);
		System.out.println(stSpring1);
		
		System.out.println("\n====== Demo of First Spring Collection ======");
		ApplicationContext ctx2 = new ClassPathXmlApplicationContext("collections.xml");
		CollectionsDemoClass col =  ctx2.getBean("collectionName", CollectionsDemoClass.class);
		System.out.println(col);
		
		System.out.println("\n====== Demo of First Spring Scopes ======");
		ApplicationContext ctx3 = new ClassPathXmlApplicationContext("scopes.xml");
		
		ScopeDemoClass single_1 = ctx3.getBean("scopeId_singleton", ScopeDemoClass.class );
		single_1.setStr("Singleton_MyUpdatedString");
		System.out.println(single_1);
		
		ScopeDemoClass single_2 = ctx3.getBean("scopeId_singleton", ScopeDemoClass.class );
		System.out.println(single_2);
		
		ScopeDemoClass proto_1 = ctx3.getBean("scopeId_prototype", ScopeDemoClass.class );
		proto_1.setStr("Prototype_MyUpdatedString");
		System.out.println(proto_1);
		
		ScopeDemoClass proto_2 = ctx3.getBean("scopeId_prototype", ScopeDemoClass.class );
		System.out.println(proto_2);
		
		System.out.println("\n====== Demo of LifeCycle Hooks ======");
		ApplicationContext ctx4 = new ClassPathXmlApplicationContext("Lifecycle.xml");
		LifeCycleHook hook = ctx4.getBean("hookId", LifeCycleHook.class);
		
		System.out.println("\n====== Demo of Autowiring ======");
		ApplicationContext ctx5 = new ClassPathXmlApplicationContext("autowiring.xml");
		
		User ctoUser = ctx5.getBean("cto", User.class);
		System.out.println(ctoUser);
		User ceoUser = ctx5.getBean("ceo", User.class);
		System.out.println(ceoUser);
		
		System.out.println("\n====== Demo of Annotation Based Autowiring ======");
		ApplicationContext ctx6 = new ClassPathXmlApplicationContext("annotation_autowiring.xml");
		Orange oFruite = ctx6.getBean(Orange.class);
		System.out.println(oFruite);
		Apple aFruite = ctx6.getBean(Apple.class);
		System.out.println(aFruite);
		Basket basket = ctx6.getBean(Basket.class);
		System.out.println(basket);
		((ClassPathXmlApplicationContext) ctx6).close();
		
		
	}
}
