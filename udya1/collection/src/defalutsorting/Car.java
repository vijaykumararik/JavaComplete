package defalutsorting;

public class Car implements Comparable<Car> {
 /*inorder to work with comparable interface we need to
  * to implements the comparale ,generics to specify
  * which object we are going to compare*/  
	
	int cost;
   Car(int cost){
	   this.cost=cost;
   }
/* to String method is to get the requird string and to
 *  override the String representation
 * */
@Override
public String toString()
{
	return "cost: "+cost;
}
//in compareable interface we have compareto()
//method so we need to overrride compareto methos and write business logic 
//to sort the object values
@Override
public int compareTo(Car c) {
	
	return this.cost-c.cost;
}

}