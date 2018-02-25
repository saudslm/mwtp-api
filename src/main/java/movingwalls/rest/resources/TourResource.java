package movingwalls.rest.resources;

import movingwalls.core.models.entities.Tour;
import org.springframework.hateoas.ResourceSupport;

public class TourResource extends ResourceSupport {
    private int tourId;
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


    public int getTourId() {
        return this.tourId;
    }

    public void setTourId(int id) {
        this.tourId = id;
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

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

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

    public Tour toTour() {
        Tour t = new Tour();
        t.setId(this.tourId);
        t.setPurpose(this.purpose);
        t.setTitle(this.title);
        t.setStartDate(this.startDate);
        t.setEndDate(this.endDate);
        t.setModeOfTravel(this.modeOfTravel);
        t.setTicketCost(this.ticketCost);
        t.setAirportCabHomeCityCost(this.airportCabHomeCityCost);
        t.setAirportCabDestinationCityCost(this.airportCabDestinationCityCost);
        t.setHotelCost(this.hotelCost);
        t.setOtherConveyanceCost(this.otherConveyanceCost);
        t.setEmployeeId(this.employeeId);
        t.setManagerId(this.managerId);
        t.setFinanceManagerId(this.financeManagerId);
        t.setStatus(this.status);
        return t;
    }
}
