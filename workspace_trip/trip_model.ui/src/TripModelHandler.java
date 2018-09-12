import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.PlatformUI;

import trip_model.OtherService;
import trip_model.Service;
import trip_model.TravelService;
import trip_model.Trip;
import trip_model.TripModel;

public class TripModelHandler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().getSelection();
				if (!(selection instanceof StructuredSelection)) return null;
				Object selected = ((StructuredSelection)selection).getFirstElement();
				// The type should be guaranteed by the "isVisibleWhen"
				assert(selected instanceof TripModel);
				TripModel tripModel =(TripModel) selected;
				//JOptionPane.showMessageDialog(null,"Cost is:"+calculateCost(tripModel));
				
				if(isValidTrip(tripModel.getTrip().get(0),tripModel.getTrip().get(0).getService()).containsKey(false)) {
					JOptionPane.showMessageDialog(null,"Invalid Trip due to: "+isValidTrip(tripModel.getTrip().get(0),tripModel.getTrip().get(0).getService()).get(false)+"Cost is:"+calculateCost(tripModel));
				}
				
				else {
					JOptionPane.showMessageDialog(null,"Valid Trip"+" "+"Cost is:"+calculateCost(tripModel));
				}
				
		System.out.println("I am executed");
		return null;
	}

	/**
	 * 
	 * @param tripModel
	 * @return
	 */
	public float calculateCost(TripModel tripModel) {
		float cost=0;
		List<Trip> trips = tripModel.getTrip();
		for(Trip trip :trips) {
			for(Service service:trip.getService()) {
				cost+=service.getCost();
			}
		}
		return cost;
	}
	
	
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}
	
	public static Map<Boolean,Object>  isValidTrip(Trip trip ,List<Service> services){
        Map<Boolean,Object> validationResult = new HashMap<Boolean,Object>();
        if(isValidTripOnly(trip).containsKey(false)){
                 validationResult.put(false,isValidTripOnly(trip).get(false));
                 return validationResult;
            }
        for(int i=0;i<services.size();i++){
        	if(services.get(i) instanceof TravelService) {
        		
        	TravelService travelService = (TravelService) services.get(i);
            if(isValidServiceOnly(travelService).containsKey(false)){
                validationResult.put(false,isValidServiceOnly(travelService).get(false));
                return validationResult;

            }
            
        }else if(services.get(i) instanceof OtherService) {
        	
        	OtherService otherService = (OtherService) services.get(i);
        	if(isValidOtherServiceOnly(otherService).containsKey(false)){
                validationResult.put(false,isValidOtherServiceOnly(otherService).get(false));
                return validationResult;

            }
        }
        }
        return validationResult;
    }
	
	

   
    public static Map<Boolean,String>  isValidTripOnly(Trip trip){
        Map<Boolean,String> validationResult = new HashMap<>();
         if(trip!=null){
             if(trip.getSource().getName().equalsIgnoreCase(trip.getDestination().getName())){
                 validationResult.put(false,"Failed Trip! Since Source & Destination should not be same ");
                 return validationResult;
             }
             else if(!dateValidator(trip.getStart(),trip.getEnd())){
                 validationResult.put(false,"Failed Trip! Start & End Date Invalid");
                 return validationResult;
             }
             else{
                 validationResult.put(true,"Passed Trip! Start & End Date Valid");
                 return validationResult;
             }
         }
        return validationResult;
    }

    public static Map<Boolean,String>  isValidServiceOnly(TravelService service){
        Map<Boolean,String> validationResult = new HashMap<>();
        if(service!=null){
            if(!service.getSource().getName().isEmpty() && !service.getDestination().getName().isEmpty()&& service.getSource().getName().equalsIgnoreCase(service.getDestination().getName())){
                validationResult.put(false,"Failed Service! Since Source & Destination should not be same ");
                return validationResult;
            }
        }

        return validationResult;
    }
    
    public static Map<Boolean,String>  isValidOtherServiceOnly(OtherService service){
        Map<Boolean,String> validationResult = new HashMap<>();
        if(service!=null){
            if(service.getLocation()==null || service.getLocation().getName().isEmpty()){
                validationResult.put(false,"Failed Service! Since Location is empty");
                return validationResult;
            }
        }

        return validationResult;
    }

  


    public static boolean dateValidator(Date start,Date end){
    	
    	if(end.compareTo(start)>0) {
    		return true;
    	}
    	else {
    		return false;
    	}
       
    }



    


}
