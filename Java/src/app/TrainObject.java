//package app;
	public class TrainObject{
		private String name;
		private TrainObject next;
		
		public TrainObject(String name ){

			this.name = name;
			this.next = null;
		}
		
		public String getName(){
			return this.name;
		}
		public TrainObject getNext(){
			return this.next;
		}
		
		public void setNext(TrainObject next){
			 this.next = next;
		}
	}