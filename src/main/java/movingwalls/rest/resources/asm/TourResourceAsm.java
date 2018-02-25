package movingwalls.rest.resources.asm;

import movingwalls.core.models.entities.Tour;
import movingwalls.rest.mvc.TourController;
import movingwalls.rest.resources.TourResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

public class TourResourceAsm extends ResourceAssemblerSupport<Tour, TourResource> {

    public TourResourceAsm() {
        super(TourController.class, TourResource.class);
    }

    @Override
    public TourResource toResource(Tour tour) {
        TourResource tourResource = new TourResource();
        tourResource.setTourId(tour.getId());
        tourResource.setTitle(tour.getTitle());
        tourResource.setPurpose(tour.getPurpose());
        tourResource.setStartDate(tour.getStartDate());
        tourResource.setEndDate(tour.getEndDate());
        tourResource.setModeOfTravel(tour.getModeOfTravel());
        tourResource.setTicketCost(tour.getTicketCost());
        tourResource.setAirportCabHomeCityCost(tour.getAirportCabHomeCityCost());
        tourResource.setAirportCabDestinationCityCost(tour.getAirportCabDestinationCityCost());
        tourResource.setOtherConveyanceCost(tour.getOtherConveyanceCost());
        tourResource.setHotelCost(tour.getHotelCost());
        tourResource.setEmployeeId(tour.getEmployeeId());
        tourResource.setManagerId(tour.getManagerId());
        tourResource.setFinanceManagerId(tour.getFinanceManagerId());
        tourResource.setStatus(tour.getStatus());

        return tourResource;
    }
}
