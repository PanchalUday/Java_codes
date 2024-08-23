package encap;

public class Marksheet {
	
	int eng , phy ,chem ,math, comp, totalobtain;
	float percentage;    
    void getmarks(int a,int b, int c, int d, int e){
        eng = a;
        phy = b;
        chem = c;
        math = d;
        comp = e;
        totalobtain = eng + phy + chem + math + comp;
        percentage = (totalobtain / 500) * 100f;
    }

    void displayresult(){
        System.out.println("Total marks ="+(int)totalobtain);
        System.out.println("Percentage = "+percentage);
    }
	
}
