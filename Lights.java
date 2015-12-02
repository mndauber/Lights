import java.util.Arrays;

public class Lights {
	private int[] lights;
	private int[] lights1;
	private int slength;

	public static void main(String[] args) {
		Lights beta = new Lights();
		beta.setLights("1010101010");
		beta.flipa();
		beta.on(0,2);
		beta.on(8,10);
		beta.off(4,6);
		beta.p();
	}

	public void p(){
		System.out.println(Arrays.toString(lights));
	}
	public void setLights(String k) {
		slength = k.length();
		lights = new int[slength];
		for (int i = 0; i < k.length(); i++) {
			lights[i] = Integer.parseInt("" + k.charAt(i));
		}
		System.out.println(Arrays.toString(lights));
	}

	public void flip(int x) {

		if (lights[x] == 1)
			lights[x] = 0;
		else
			lights[x] = 1;
	}

	public void flip(int x, int y) {
		for (int z = x; z < y; z++) {

			if (lights[z] == 1)
				lights[z] = 0;
			else
				lights[z] = 1;
		}
	}
	
	public void flipa() {
		for (int z = 0; z < slength; z++) {

			if (lights[z] == 1)
				lights[z] = 0;
			else
				lights[z] = 1;
		}
	}
	
	
	public void on(int x, int y) {
		for (int z = x; z < y; z++) {

			if (lights[z] == 0)
				lights[z] = 1;
		}
	}
	
	public void ona() {
		for (int z = 0; z < slength; z++) {

			if (lights[z] == 0)
				lights[z] = 1;
		}
	}
	
	
	public void off(int x, int y) {
		for (int z = x; z < y; z++) {

			if (lights[z] == 1)
				lights[z] = 0;
		}
	}
	
	
	public void offa() {
		for (int z = 0; z < slength; z++) {

			if (lights[z] == 1)
				lights[z] = 0;
		}
	}

	
}


