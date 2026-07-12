package day15;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface gsit
{
	String batchCode()default "2026";
	
}
class Demo
{
	protected static String demonId;
	
   @gsit(batchCode="Feb 2026")
     void getData() 
     
   {
	   
   }

}
public class Program_Annotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Class<Demo>obj=Demo.class;
		Field[]variables=obj.getDeclaredFields();
		for(Field f:variables)
		{
			System.out.print(f.getName());
			int modifier=f.getModifiers();
			System.out.println(Modifier.toString(modifier));
		}
		Method[]methods=obj.getDeclaredMethods();
		for (Method method:methods) 
		{
			System.out.print(method.getName()+" ");
		 }
		Method method1=obj.getDeclaredMethod("getData");
			gsit ann=method1.getAnnotation(gsit.class);
			System.out.print(ann.batchCode());
			
		}

	}



