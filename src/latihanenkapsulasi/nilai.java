package latihanenkapsulasi;


public class nilai {
private int nilaipraktik;
private int nilaiteori;

public int getnilaipraktik(){
    return nilaipraktik;
}

public void setnilaipraktik(int nilaipraktik){
    this.nilaipraktik=nilaipraktik;
}
    
 public int getnilaiteori(){
  return nilaiteori;
    }
 
 public void setnilaiteori(int nilaiteori){
    this.nilaiteori=nilaiteori;
}
    
 public nilai(){
     int nilaip=0;
     int nilait=0;
 }
 
 public int nilaiakhir(int nilaip, int nilait){
     return (nilaip+nilait)/2;
     
 }
 
 public int getnilaiakhir(){
     return nilaiakhir(nilaipraktik, nilaiteori);
 }


}
