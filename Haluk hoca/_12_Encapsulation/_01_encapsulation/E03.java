package _12_Encapsulation._01_encapsulation;

public class E03 {

		private int num = 12;
		private String name = "Emine";
		private char initial = 'J';
		private boolean old = true;

		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public char getInitial() {
			return initial;
		}
		public void setInitial(char initial) {
			this.initial = initial;
		}
		public boolean isOld() {
			return old;
		}
		// Data type boolean oldugu zaman getter() method	'un ismi "get" ile degil "is" ile baslar.
		public void setOld(boolean old) {
			this.old = old;
		}
		
		
}

