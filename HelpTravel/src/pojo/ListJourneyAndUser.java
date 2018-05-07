/**
 * 
 */
package pojo;

import java.util.List;

import po.Journey;

/**
 * @author Administrator
 *
 */
public class ListJourneyAndUser {
private   List<JourneyAndUser> journeys;
private   int rows;
public List<JourneyAndUser> getJourneys() {
	return journeys;
}
public void setJourneys(List<JourneyAndUser> journeys) {
	this.journeys = journeys;
}
public int getRows() {
	return rows;
}
public void setRows(int rows) {
	this.rows = rows;
}
}
