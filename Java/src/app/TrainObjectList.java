//package app;


public class TrainObjectList{
	

	//public TrainObject current;
	TrainObject o1 ;
	TrainObject o2 ;
	TrainObject o3 ;
	TrainObject o4 ;
	TrainObject o5 ;
	TrainObject o6 ;
	TrainObject o7 ;
	TrainObject o8 ;
	TrainObject o9 ;
	TrainObject o10 ;
	TrainObject o11 ;
	
	
	
	public TrainObjectList(){
		
		//create objects
		o1 = new TrainObject("o1");
		o2 = new TrainObject("o2");
		o3 = new TrainObject("o3");
		o4 = new TrainObject("o4");
		o5 = new TrainObject("o5");
		o6 = new TrainObject("o6");
		o7 = new TrainObject("o7");
		o8 = new TrainObject("o8");
		o9 = new TrainObject("o9");
		o10 = new TrainObject("o10");
		o11 = new TrainObject("o11");
		
		//create links on other  objects
		o1.setNext(o2);
		o2.setNext(o3);
		o3.setNext(o4);
		o4.setNext(o5);
		o5.setNext(o6);
		o6.setNext(o7);
		o7.setNext(o8);
		o8.setNext(o9);
		o9.setNext(o10);
		o10.setNext(o11);
		
		
		// create link last element
		//o11.setNext(o1);

	}
	
	public boolean check(){
		
		TrainObject current = o1;

		while(current.getNext() != null || current.getNext() != o1){
	
			current = current.getNext();
			if(current == null) return false;
			if(current == o1) return true;
		}
		return true;
	}
}