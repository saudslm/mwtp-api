package movingwalls.core.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tours")
public class Tour {

    @Id @GeneratedValue
    private int id;
    private String title;
    private String purpose;
    private String startDate;
    private String endDate;
    private String modeOfTravel;
    private double ticketCost;
    private double airportCabHomeCityCost;
    private double airportCabDestinationCityCost;
    private double hotelCost;
    private double otherConveyanceCost;     //Local Conveyance Cost at tour location

    private String status;

    private int employeeId;
    private int managerId;
    private int financeManagerId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getModeOfTravel() {
        return modeOfTravel;
    }

    public void setModeOfTravel(String modeOfTravel) {
        this.modeOfTravel = modeOfTravel;
    }

    public double getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(double ticketCost) {
        this.ticketCost = ticketCost;
    }

    public double getAirportCabHomeCityCost() {
        return airportCabHomeCityCost;
    }

    public void setAirportCabHomeCityCost(double airportCabHomeCityCost) {
        this.airportCabHomeCityCost = airportCabHomeCityCost;
    }

    public double getAirportCabDestinationCityCost() {
        return airportCabDestinationCityCost;
    }

    public void setAirportCabDestinationCityCost(double airportCabDestinationCityCost) {
        this.airportCabDestinationCityCost = airportCabDestinationCityCost;
    }

    public double getHotelCost() {
        return hotelCost;
    }

    public void setHotelCost(double hotelCost) {
        this.hotelCost = hotelCost;
    }

    public double getOtherConveyanceCost() {
        return otherConveyanceCost;
    }

    public void setOtherConveyanceCost(double otherConveyanceCost) {
        this.otherConveyanceCost = otherConveyanceCost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getEmployeeId() { return employeeId; }

    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getFinanceManagerId() {
        return financeManagerId;
    }

    public void setFinanceManagerId(int financeManagerId) {
        this.financeManagerId = financeManagerId;
    }
}
