package java_examples;

public class Cities {
        String name;
        int distance;
        int price;
		public Cities(String name, int distance, int price) {
			this.name = name;
			this.distance = distance;
			this.price = price;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getDistance() {
			return distance;
		}
		public void setDistance(int distance) {
			this.distance = distance;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
       
}
