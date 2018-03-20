package Number1p;
//查找末尾字母相同的字符串
public class ForFor {
	public static void main(String args[]) {
		String[] peopleArr= {"张三","李四","王五","赵六","周七","王哲","白浩","贾荣","阿三","杭荣"};
		for(int i=0;i<=peopleArr.length;i++) {
			for(int j=i+1;j<peopleArr.length;j++) {
				char lastEm=peopleArr[i].charAt(peopleArr[i].length()-1);
				String lastEnString=String.valueOf(lastEm);
				if(peopleArr[j].endsWith(lastEnString)&&(i!=j)) {
					System.out.println(peopleArr[j]);
					System.out.println(peopleArr[i]);
				}
			}//添加了测试
		}//这个在git官网进行了修改 
	}//调整为正确的编码后又进行了一次官网上提交
}
