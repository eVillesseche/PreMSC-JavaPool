import java.lang.reflect.*;

import jdk.jshell.spi.ExecutionControl.ExecutionControlException;

public class Inspector<T>{

    private Class<T> inspectedClass;

    public Inspector(Class<T> class1){
        this.inspectedClass = class1;
    }

    public void displayInformations(){
        System.out.println("Information of the \"" + this.inspectedClass.getName() + "\" class:");
        System.out.println("Superclass: " + this.inspectedClass.getSuperclass().getName());
        
        Method[] methods = this.inspectedClass.getDeclaredMethods();
        Field[] fields = this.inspectedClass.getDeclaredFields();

        System.out.println(methods.length + " methods:");
        for (Method method : methods){
            System.out.println("- " + method.getName());
        }

        System.out.println(fields.length + " fields:");
        for (Field field : fields){
            System.out.println("- " + field.getName());
        }
    }

    public Object createInstance() throws Exception{
        return this.inspectedClass.getConstructor().newInstance();
    }

    public static void main(String[] args) {
        Inspector<Number> inspector =  new Inspector<>(Number.class);
        inspector.displayInformations();
    }
}