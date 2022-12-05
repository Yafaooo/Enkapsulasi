package latihanenkapsulasi;

public class Latihanenkapsulasi {
    public static void main(String[] args) {

        nilai p= new nilai();
        
p.setnilaipraktik(60);
p.setnilaiteori(80);

        System.out.println("nilai praktik : "+p.getnilaipraktik());
        System.out.println("nilai teori : "+p.getnilaiteori());
        System.out.println("nilai akhir : "+p.getnilaiakhir());
    }
    
}
