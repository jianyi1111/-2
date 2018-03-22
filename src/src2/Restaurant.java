package src2;

public class Restaurant {
	private Cook cook=new Cook();
	public void takeOrder(String dish) {
		cook.cooking(dish);
		System.out.println("您的菜做好了，请慢用");
	}
	public String saySorry() {
		return "很抱歉，餐厅不提供此服务";
	}
	public static void main(String args[]) {
		Restaurant waiter =new Restaurant();
		System.out.println("请让厨师帮我做一道香辣肉丝");
		waiter.takeOrder("香辣肉丝");
		System.out.print("你们的厨师叫什么名字");
		System.out.print(waiter.saySorry());
		System.out.print("请让厨师帮我切一点葱花");
		System.out.print(waiter.saySorry());
	}
	class Cook{
		private String name;
		public Cook() {
			this.name="tom.Cruise";
		}
		private void cutOnion() {
			System.out.print(name+"切葱花");
		}
		private void washVegtavles() {
			System.out.print(name+"洗蔬菜");
		}
		void cooking(String dish) {
			washVegtavles();
			cutOnion();
			System.out.print(name+"开始切菜"+dish);
		}
	}
}
