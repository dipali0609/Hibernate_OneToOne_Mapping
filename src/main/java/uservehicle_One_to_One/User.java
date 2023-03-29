package uservehicle_One_to_One;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.JoinColumnOrFormula;

@Entity
public class User
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int userid;
    private String username;
    
    
    public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	@OneToOne
	@JoinColumn(name="vehicleid")
    Vehicle vehicle;
    
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userid, String username) {
		super();
		this.userid = userid;
		this.username = username;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + "]";
	}
    
}
