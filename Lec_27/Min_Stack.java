package Lec_27;

import Lec_26.Dynamic_Stack;

public class Min_Stack extends Dynamic_Stack {
	int curr_min;
	public int min() {
		return curr_min;
	}
	@Override
	public int peek() {
		if (super.peek() >= curr_min) {
			return super.peek();
		} else {
			return curr_min;
		}
	}

	@Override
	public void add(int ali) {
		if (this.isEmpty()) {
			curr_min = ali;
			super.add(ali);
		} else if (ali >= curr_min) {
			super.add(ali);
		}else {
//			naya number aaya
			int prev_min = curr_min;
			curr_min = ali;
			int Magiic = 2*curr_min - prev_min;
			super.add(Magiic);
		}
	}
	@Override
	public int pop() {
		if(super.peek()>=curr_min) {
			return super.pop();	
		}else {
			int magioic = super.pop();
			int ans = curr_min;
			int prev_min = 2*curr_min- magioic;
			curr_min = prev_min;
			
			return ans;
		}
		
	}

}
