package apex1.spring.core1.pojo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Basket {
	
	@Autowired
	private Apple apple;
		
	@Autowired
	private Orange orange;

	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}

	public Orange getOrange() {
		return orange;
	}

	public void setOrange(Orange orange) {
		this.orange = orange;
	}

	@Override
	public String toString() {
		return "Basket [apple=" + apple + ", orange=" + orange + "]";
	}
	
	

}
