public class Main {
//creates a class called PosComp1 that has a method that return 1 this method is called Calcula
	  public static class PosComp1 {
	public int Calcula() {
	  return 1;
	}
  }
//creates a class that get heritance of PosComp1 called PosComp2 that has a method that return 2 this method is called Calcula
	  public static class PosComp2 extends PosComp1 {
		  @Override
		  public int Calcula() {
	  return 2;
	}
  }
//creates a class that get heritance of PosComp2 called PosComp3 that has a method that return 3 this method is called Calcula
	  public static class PosComp3 extends PosComp2 {
		  @Override
		  public int Calcula() {
			  return 3;
		  }
	  }

	public static void main(String[] args) {
		int result = 0;
		PosComp1 poscomp1[] = new PosComp1[3];
		poscomp1[0] = new PosComp1();
		poscomp1[1] = new PosComp2();
		poscomp1[2] = new PosComp3();
		for (int i = 0; i < 3; i++) {
			result += poscomp1[i].Calcula();
		}
		System.out.println(result);
	}

}
