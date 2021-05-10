package prob2B;

public class OrderLine {
  private String name;
 
  OrderLine()
  {
	  this.name="";
	 
  }
  OrderLine(String Name)
  {
	  this.name=Name;
	  
	 
  }

@Override
public String toString() {
	return "OrderLine [name=" + name  + "]";
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
