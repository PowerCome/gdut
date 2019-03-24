package firstweek;

/**
 * @ClassName:  ${Struct}
 * @Description:${create a template}  
 * @author: Rachel
 * @date:   ${2019/03/24}
 */
/**创建结构体*/
class Struct{
	/**数据*/
	String data;   
	/**指针*/
    Struct next; 
    Struct front;
	
	Struct(String data){
		this.data=data;
		this.next=null;
		this.front=null;
	}
}

/**
 * @ClassName:  ${Link}   
 * @Description:${create interface}  
 * @author: Rachel
 * @date:   ${2019/03/24}
 */
public interface Link {
	
    public int f=2;
	/**错误提醒*/
	public void warning();
	
	/**增加结点*/
	public void addNode(String data);
	
	/**销毁链条*/
	public void destroyLink();
	
	/**删除含指定数据的结点*/
	public Struct deleteElement(String str);
	
	/**找到中点并返回对应的数据*/
	public String getMiddle();

	/**查看链条*/
	public Struct putout();
	
	/**获取头指针*/
	public Struct gethead();
	

}
