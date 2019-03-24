package firstweek;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in); 
		/*检测双向链表*/
		TwoWayChain chain=new TwoWayChain();
		/*定义为String，防止用户输入字符等造成程序结束*/
		String num;        
		String st ="###";
		System.out.println("-------------"+"请在以下几个选项中选择你的操作"+"-------------");
		System.out.println("                 |1|  生成链条                                                   ");
		System.out.println("                 |2|  销毁链条                                                   ");
		System.out.println("                 |3|  查找中点                                                   ");
		System.out.println("                 |4|  删除结点                                                   ");
		System.out.println("                 |5|  查看链条                                                   ");
		System.out.println("                 |6|  结束                                                       ");
		System.out.println("--------------------------------------------------------");
		OUT:
		while(true){
			
		    System.out.println("请输入对应的数字：");
			num=in.next();
			switch(num)
			{
			case "1": 
			    {       System.out.println("请输入你要生成的链条中每个结构体的的数据：");
				        System.out.println("注意：当输入数据为 '###' 时，链条结束");
				        String str=in.next(); 
					    while(!st.equals(str))
					    {
					    	chain.addNode(str);
					    	str=in.next();
					    }
					    System.out.println("链条生成成功！");
					    break;
			    }
			case "2":chain.destroyLink();break;
			case "3":System.out.print(chain.getMiddle());break;
			case "4":
			{
				if(chain.gethead()==null) {
					chain.warning();
				}
				else{
					System.out.println("请输入你要删除的数据:");
					chain.deleteElement(in.next());
				}
				 break;
			}
				
			case "5": chain.putout();break;
			/*结束进程*/
			case "6":System.out.println("再见！");break OUT;
			default: System.out.println("错误！输入的数据无效，请从给出的数据中选择");
			
	           }
		   }
      }
	}
