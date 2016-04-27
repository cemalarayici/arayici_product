package sell_arayici;

public class Product{
	private String name;
	private float price = 10f;
	
	public Product(){
		setName(name);
	}
	
	public String getName(){
		return name;
	}
	
	public String setName(){
		this.name = name;
	}
}