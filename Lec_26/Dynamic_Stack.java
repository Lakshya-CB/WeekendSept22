package Lec_26;

public class Dynamic_Stack extends Stack {

	@Override
	public void add(int ali) {
		if (!isFull()) {
//			add(ali);
			super.add(ali);
		} else {
			int[] big = new int[2*this.arr.length];
			for(int i=0;i<arr.length;i++) {
				big[i] = arr[i];
			}
//			
			this.arr = big;
			
			super.add(ali);

		}
	}

}
