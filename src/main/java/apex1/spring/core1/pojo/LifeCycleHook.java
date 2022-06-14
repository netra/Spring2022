package apex1.spring.core1.pojo;

public class LifeCycleHook {
	
	static {
		System.out.println("Static Block :: LifeCycleHook.enclosing_method()");
	}
	{
		System.out.println("Init Block :: LifeCycleHook.enclosing_method()");
	}
	
	public void init() {
		System.out.println("LifeCycleHook.init()");
	}
	
	public void destroy() {
		System.out.println("LifeCycleHook.destroy()");
	}
	
	public LifeCycleHook() {
		System.out.println("LifeCycleHook.LifeCycleHook()");
	}

}
