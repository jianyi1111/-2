
public class ContainsString {
	public static void main(String args[]) {
		String str="½ñÌìµÄ²ËÆ×ÓĞ£ºÕôÑò¸á£¬ÕôĞÜÕÆ£¬ÕôÂ¹Î²£¬ÉÕ»¨Ñ¼£¬À°Èâ£¬ºº±¤";
		System.out.println(str);
		boolean request1=str.contains("À°Èâ");
		System.out.print("ÓĞÃ»ÓĞÀ°Èâ"+request1);
	}
}
