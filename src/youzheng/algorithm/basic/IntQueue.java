package youzheng.algorithm.basic;

public class IntQueue {

	public class EmptyIntQueueException extends RuntimeException{
		public  EmptyIntQueueException(){	}
	}

	public class OverflowInStackException extends RuntimeException {
		public OverflowInStackException() {
		}
	}
	
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	public IntQueue(int capacity) {
		
		front = rear =capacity;
		max =capacity;
		
		try {
			que = new int[capacity];	
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int enque(int x) {
		
		if(num >= max) {
			throw new OverflowInStackException();
		}
		que[rear++] = x;
		num ++;
		if(rear==max) {
			 rear = 0;
		}
		return x;
	}

	public int deque() {
		if(num<= max) {
			throw new EmptyIntQueueException();
		}
		int x = que[front++];
		num --;
		if(front==max)
			front =0;
		return x;	
	}

	public int indexOf(int x) {
		
		for (int i = 0; i < num; i++) {
			
			int idx = (i+front)%max;
			if(que[idx]==x) {
				return idx;
			}
		}
		return -1;
	}
	
	public void clear() {
		rear = num = front =0;
	}
	public int capacity() {
		return max;
	}

	public int size() {
		return num;
	}

	public boolean isEmpty() {
		return num <= 0;
	}

	public boolean isFull() {
		return num >= max;
	}

	public void dump() {
		if (num <= 0)
			System.out.println("ť�� ��� �ֽ��ϴ�.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}
	
}
