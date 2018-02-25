package movingwalls.rest.resources.asm;

import movingwalls.core.services.utils.TourList;
import movingwalls.rest.mvc.TourController;
import movingwalls.rest.resources.TourListResource;
import movingwalls.rest.resources.TourResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import java.util.List;

public class TourListResourceAsm extends ResourceAssemblerSupport<TourList, TourListResource> {

    public TourListResourceAsm() {

        super(TourController.class, TourListResource.class);
    }

    @Override
    public TourListResource toResource(TourList tourList) {
        List<TourResource> resList = new TourResourceAsm().toResources(tourList.getTours());
        TourListResource finalRes = new TourListResource(resList);
        return finalRes;
    }
}
