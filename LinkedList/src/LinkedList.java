

public class LinkedList {
	
Node header;
	
	static class Node{
		int data;
		Node next = null;
	}
	
	LinkedList()
	{
		header = new Node();
	}
	

		Node get(int index)
		{
			Node n = header;
			for(int i=0;i<index;i++)
			{
				if(n.next != null)
					n = n.next;
				
				else
					return null;
			}
			
			return n;
		}
		
		void append(int d)
		{
			Node end = new Node();
			end.data = d;
			Node n = header;
			while(n.next != null)
			{
				n = n.next;
			}
			n.next = end;
		}
		
		void delete(int d)
		{
			Node n = header;
			while(n.next != null)
			{
				if(n.next.data == d)
				{
					n.next = n.next.next;
				}
				else
				{
					n = n.next;
				}			
			}
		}
		
		void retrieve()
		{
			Node n = header.next;
			while(n.next != null)
			{
				System.out.print(n.data + "->");
				n = n.next;
			}
			System.out.println(n.data);
		}
		
		void removeDups()
		{
			Node n = header;
			while(n != null && n.next != null)
			{
				Node r = n;
				while(r.next != null)
				{
					if(n.data == r.next.data)
						r.next = r.next.next;
					else
						r = r.next;
				}
				n = n.next;
			}
		}
/*		
		Node KthToLast(int k)
		{
			Node n = header;
			int total = 1;
			while(n.next != null)
			{
				n = n.next;
				total++;
			}
			n = header; 
			for(int i=1; i<total-k; k++)
			{
				n = n.next;
			}
			return n;
		}
*/	
	
/*		
		private static Node KthToLast(Node n, int k, Reference r)
		{
			if(n == null)
				return null;
			
			Node found = KthToLast(n.next, k, r);
			r.count++;
			if(r.count == k)
				return n;
				
			return found;
		}
*/
		
		private static Node KthToLast(Node first, int k)
		{
			Node p1 = first;
			Node p2 = first;
			
			for(int i=0; i<k; i++)
			{
				if(p1 == null)
					return null;
				else
					p1 = p1.next;
			}
			while(p1 != null)
			{
				p1 = p1.next;
				p2 = p2.next;
			}
			return p2;	
		}
		
		private static boolean deleteNode(Node n)
		{
			if(n == null || n.next == null)
				return false;
			
			Node next = n.next;
			n.data = next.data;
			n.next = next.next;
			return true;
		}
		
		private static Node SumLists(Node L1, Node L2, int carry)
		{
			if(L1 == null && L2 == null && carry ==0)
				return null;
			
			Node result = new Node();
			int val = carry;
			
			if(L1 != null)
			{
				val += L1.data;			
			}
			if(L2 != null)
			{
				val += L2.data;
			}
			
			result.data = val%10;
			carry = val/10;
			if(L1 != null || L2 != null)
			{
				Node next = SumLists(L1==null?null:L1.next,L2==null?null:L2.next,carry);
				result.next = next;
			}
	
			
			return result;
		}
		
		private static Node insertBefore(Node node, int data)
		{
			Node before = new Node();
			before.data = data;
			if(node != null)
				before.next = node;
			return before;
		}
		
		private static Node LPadList(Node l, int length)
		{
			Node head = l;
			int pad_num = getListLength(l) - length;
			for(int i=0;i<pad_num;i++)
			{
				head = insertBefore(head,0);
			}
		
			return head;
		}
		
		private static int getListLength(Node l)
		{
			int total = 0;
			while(l != null)
			{
				l = l.next;
				total++;
			}
			
			return total;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList L1 = new LinkedList();
		LinkedList L2 = new LinkedList();
		LinkedList L3 = new LinkedList();
		
		L1.append(6);
		
		L2.append(9);
	
		
		L1.retrieve();
		L2.retrieve();
		
		L3.header = L3.SumLists(L1.header,L2.header,0);
		L3.retrieve();
		

		//System.out.println(L1.get(4).data);
		

	}
}


class Reference{
	public int count = 0;
}
