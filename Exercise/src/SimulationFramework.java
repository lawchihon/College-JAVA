public class SimulationFramework {
	public void scheduleEvent(Event newEvent) {
		// put or addElement “newEvent” to the “eventQueue”
		// MinHeap Priority Queue (left for you)
		eventQueue.addElement(newEvent);
	}

	public void run () {
		while (! eventQueue.isEmpty()) {
			Event nextEvent = (Event) eventQueue.removeMin();
			currentTime = nextEvent.time;
			nextEvent.processEvent();
		}
	}
	
	public int time() {
		return currentTime;
	}

	private int currentTime = 0;
	private FindMin eventQueue = new Heap(new DefaultComparator());
	
	public int weightedProbability(int[] beertype){
		int sumOfArray = 0;
		for (int i=0; i < beertype.length; i++){
			sumOfArray += beertype[i];
		}
		int probability = 1 + (int) ((sumOfArray) * Math.random());
		if (probability <= 15){
			return 0;
		}
		else if (probability <= 75){
			return 1;
		}
		else{
			return 2;
		}
	}
}
