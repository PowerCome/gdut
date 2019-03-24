package firstweek;

/**
 * @ClassName:  ${Adtlink}   
 * @Description:${create twowaychains}  
 * @author: Rachel
 * @date:   ${2019/03/24}
 */
public class TwoWayChain implements Link{

	
	private Struct head=null;  
	private Struct currentNode;    
	private int size=0;
	
	
	/**错误提醒*/
	public void warning() {
			System.out.println("请先输入1，生成一条链条");
		}
	
    /**增加结点*/
	public void addNode(String data) {
		Struct a=new Struct(data);
		if(size==0) {
			currentNode=head=a;
			}
		else{
			currentNode.next=a;
			a.front=currentNode;
			currentNode=currentNode.next;
		}
			
		size++;
	}
	
	/**销毁链条*/
	public void destroyLink() {
		if(head==null) {
			warning();  
		}
		/*删除结点，链条无引用变量引用，不久后被垃圾回收*/
		else{
			head=null;  
			currentNode=null;
		/*重置链条长度为0*/
		size=0;  
		System.out.println("销毁成功！");
		}
	}
	
	/**删除含指定数据的结点*/
	public Struct deleteElement(String str) {
		/*判断头结点是否需要删除*/
			while(head.data.equals(str)) {
			head=head.next;
		}
		Struct head1=head;
		Struct head2=head.next;
		while(head2!=null) {
			/*判断数据是否相同*/
			if(!head2.data.equals(str)) {
				head1=head1.next;
				head2=head2.next;
			}
			else {
				/*防止有多个Struct数据与指定数据相同*/
				while(head2!=null&&head2.data.equals(str)) {
					head2=head2.next;    
				}
					head1.next=head2;
					if(head2!=null) {
						head2.front=head1;
				
			}
			
		  }
		}	
	
		System.out.println("删除成功！");
		/*返回删除结点后链条的头指针*/
		return head;
}
	
	/**找到中点并返回对应的数据*/
	public String getMiddle(){
		if(head==null) {
			warning();
			return "";
		}
		else{
			Struct j=head;
			/*找到中间的结构体*/
		    for(int i=1;i<size/f;i++) {
			          j=j.next;
			}
			/*判断链条长度时奇数还是偶数*/
			if(size%f!=0) {
				return "该链条中点数据为"+j.data+"\n";
			}
			else {
				return "该链条中点有两个，数据分别是"+j.data+"和"+j.next.data+"\n";
			}
	  }
	}
	
	/**查看链条*/
	public Struct putout(){
		if(head==null) {
			warning();
		}
		else{
			Struct current =head;
		/*遍历链条并输出*/
			while(current!=null) {
				System.out.print(current.data+" ");
				current=current.next;
			  }
			System.out.println();
		}
		return head;
	}
	
	/**获取头指针*/
	public Struct gethead() {
		return head;
	}
}

