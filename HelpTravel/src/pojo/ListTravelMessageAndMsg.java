/**
 * 
 */
package pojo;

import java.util.List;

import po.Journey;
import po.Travelmessage;

/**
 * @author Administrator
 *
 */
public class ListTravelMessageAndMsg {
  int rows;
	
	List<Travelmessage> travelmessages;
	String Msg;
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public List<Travelmessage> getTravelmessages() {
		return travelmessages;
	}
	public void setTravelmessages(List<Travelmessage> travelmessages) {
		this.travelmessages = travelmessages;
	}
	public String getMsg() {
		return Msg;
	}
	public void setMsg(String msg) {
		Msg = msg;
	}
}
