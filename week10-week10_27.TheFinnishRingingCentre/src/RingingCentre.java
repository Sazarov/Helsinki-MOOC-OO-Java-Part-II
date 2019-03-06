import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {
	private Map<Bird, List<String>> observations;
	
	public RingingCentre() {
		observations = new HashMap<Bird, List<String>>();
	}
	
	public void observe(Bird bird, String place) {
		List<String> locationList = new ArrayList<String>();
		if (observations.containsKey(bird)) {
			locationList = observations.get(bird);
		}
		locationList.add(place);
		observations.put(bird, locationList);
	}
	
	public void observations(Bird bird) {
		if (observations.containsKey(bird)) {
			ArrayList<String> birdSightings = (ArrayList<String>)observations.get(bird);
			System.out.println(bird + " observations: "  + birdSightings.size());
			
			for (String sighting :
					birdSightings) {
				System.out.println(sighting);
			}
		} else {
			System.out.println(bird + " observations: 0");
		}

	}
}
