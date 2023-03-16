class employee{
	private int id;
	private int phonenumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", phonenumber=" + phonenumber + "]";
	}
	
	
	
}
public class Getters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e =new employee();
		e.setId(1002);
		e.setPhonenumber(727855);
		System.out.println(e.toString());
				

	}

}
