package s201708024204;

public class fish extends Animal implements singable{
		private boolean isocean;

		public fish() {
			super();
			// TODO Auto-generated constructor stub
		}

		public fish(String name, int weight, String color,boolean isocean) {
			super(name, weight, color);
			// TODO Auto-generated constructor stub
		}

		public fish(boolean isocean) {
			super();
			this.isocean = isocean;
		}

		public boolean isIsocean() {
			return isocean;
		}

		public void setIsocean(boolean isocean) {
			this.isocean = isocean;
		}

		@Override
		public boolean equals(Object arg0) {
			fish ff=(fish)arg0;
			if(this.isocean==ff.isocean&&super.equals(arg0))
			return true;
			return false;
		}

		@Override
		public void sing() {
			System.out.println("bulu bulu bulu");
			
		}
		
}
