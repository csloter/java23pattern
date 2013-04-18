package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8135734048242069477L;
	private String name;
	
	public Employee(){
		
	}
	
	public Employee(String name){
		this.name = name;
		System.out.println("employee" + this.name);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		Employee e = new Employee("e1");
		ObjectOutputStream o = new ObjectOutputStream( new FileOutputStream("d:\\e"));
		o.writeObject(e);
		o.close();
		
		ObjectInputStream i = new ObjectInputStream( new FileInputStream("d:\\e"));
		Employee e1 = (Employee) i.readObject();
		System.out.println(e1.getName());
	}
}
